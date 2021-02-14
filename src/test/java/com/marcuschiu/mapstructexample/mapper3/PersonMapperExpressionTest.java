package com.marcuschiu.mapstructexample.mapper3;

import com.marcuschiu.mapstructexample.MapstructExampleApplication;
import com.marcuschiu.mapstructexample.mapper3.models.PersonA;
import com.marcuschiu.mapstructexample.mapper3.models.PersonB;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MapstructExampleApplication.class)
class PersonMapperExpressionTest {

	@Autowired
	PersonMapperExpression personMapperExpression;

	@Test
	void test() {
		PersonA personA = PersonA.builder()
				.name("Marcus Chiu")
				.age(26)
				.a("a")
				.build();

		PersonB mappedPersonB = personMapperExpression.personAToPersonB(personA);
		PersonA mappedPersonA = personMapperExpression.personBToPersonA(mappedPersonB);

		System.out.println(mappedPersonB);
		System.out.println(mappedPersonA);
//		assert mappedPersonA.equals(personA);
	}

}
