package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasSize;

import main.AssertMap;

class AssertMapTest {

	public static Map<String, String> map;
	private static final String KEY = "key";
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("@BeforeAll");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("@BeforeEach");
		//initialization of map (from AssertMap class)
		map = new HashMap<>();
		map = AssertMap.getMap();
	}

//	@Test
//	void testGetMap() 
//	{ 
//////1. JUnit5 Test der überprüft, dass die aktuelle Größe der Map 4 ist
////		
////		assertThat(2+2, is(4));
//		
//		// 'theString' should contain 'S' and 'r'
//		assertThat("theString", both(containsString("S")).and(containsString("r")));
//		List<String> items = Arrays.asList("John", "James", "Julia", "Jim");
//		// items list should have James and Jim
//		assertThat(items, hasItems("James", "Jim"));
//		// Every item in the list should have the character 'J'
//		assertThat(items, everyItem(containsString("J")));
//		// check all of the matchers
//		assertThat("Once", allOf(equalTo("Once"), startsWith("O")));
//		// negation of all of the matchers
//		assertThat("Once", not(allOf(equalTo("test"), containsString("test"))));
//		assertThat(items , hasSize(4));		
//	}
	
	
	@Nested
	@DisplayName("should contain the korrekt entry")
	class Nest {
		
		@Test
		void korrektEntryTest() {
			assertThat(map.size(), is(4)); 
		}
		
		@Test
		void checkEntry() {
//			assertThat(map.get("c"), "c++");
		}
	} 

}
