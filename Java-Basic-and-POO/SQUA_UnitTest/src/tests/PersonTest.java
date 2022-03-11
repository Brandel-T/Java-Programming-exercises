package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Person;

class PersonTest {
	
	@Test
	void testPerson() {
		//fail("Not yet implemented"); 
		Person me = new Person("myName", 6);
		assertThrows(IllegalArgumentException.class, () -> me.getAge());
		
	}

}
