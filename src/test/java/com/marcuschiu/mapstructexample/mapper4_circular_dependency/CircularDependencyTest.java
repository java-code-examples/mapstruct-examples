package com.marcuschiu.mapstructexample.mapper4_circular_dependency;

import com.marcuschiu.mapstructexample.MapstructExampleApplication;
import com.marcuschiu.mapstructexample.mapper4_circular_dependency.models.Child;
import com.marcuschiu.mapstructexample.mapper4_circular_dependency.models.ChildDto;
import com.marcuschiu.mapstructexample.mapper4_circular_dependency.models.Father;
import com.marcuschiu.mapstructexample.mapper4_circular_dependency.models.FatherDto;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = MapstructExampleApplication.class)
class CircularDependencyTest {

    @Autowired
    private CircularDependencyMapper circularDependencyMapper;

    @Test
    void test1() {
        Father father = generateFather("Father", 3);

        FatherDto fatherDto = circularDependencyMapper.toDto(father, new CycleAvoidingMappingContext());

        assertEquals("Father", fatherDto.getName());
        assertEquals(3, fatherDto.getChildren().size());
        assertEquals(fatherDto, fatherDto.getChildren().get(0).getFather());
    }

    @Test
    void test2() {
        Child child = generateFather("Father", 3).getChildren().get(0);

        ChildDto childDto = circularDependencyMapper.toDto(child, new CycleAvoidingMappingContext());

        assertEquals("Child 0", childDto.getName());
        assertEquals("Father", childDto.getFather().getName());
        assertEquals(3, childDto.getFather().getChildren().size());
    }

    private Father generateFather(String name, int numChildren) {
        Father father = new Father();
        father.setName(name);

        List<Child> children = new ArrayList<>();
        for (int i = 0; i < numChildren; i++) {
            Child child = generateChild("Child " + i);
            child.setFather(father);
            children.add(child);
        }
        father.setChildren(children);

        return father;
    }

    private Child generateChild(String name) {
        Child child = new Child();
        child.setName(name);
        return child;
    }
}
