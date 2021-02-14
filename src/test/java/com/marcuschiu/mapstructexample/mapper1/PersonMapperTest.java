package com.marcuschiu.mapstructexample.mapper1;

import com.marcuschiu.mapstructexample.MapstructExampleApplication;
import com.marcuschiu.mapstructexample.mapper1.models.PersonA;
import com.marcuschiu.mapstructexample.mapper1.models.PersonB;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MapstructExampleApplication.class)
class PersonMapperTest {

	@Autowired
	PersonMapper personMapper;

	@Test
	void test() {
		PersonA personA = PersonA.builder()
				.name("Marcus Chiu")
				.age(26)
				.a("a")
				.build();

		PersonB mappedPersonB = personMapper.personAToPersonB(personA);
		PersonA mappedPersonA = personMapper.personBToPersonA(mappedPersonB);

		assert mappedPersonA.equals(personA);
	}

}
