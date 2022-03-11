package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MainTest {
	
	@BeforeAll
	static void setup() {
		System.out.println("beforeAll executed.");
	}
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

//	@Tag("check_equality")
//	@Test
//	@DisplayName("Test ob eagl 2.")
//	@RepeatedTest(5)
	@ParameterizedTest(name = "{index}: {0}")
	@ValueSource(strings= {"foo", "bar", "baz"})
	void myFirstTest() {
		assertEquals(2, 1+1, "should be equal 2");
//		assertTrue(2==2, ()->{return "wird nur ausgewertet, wenn Assertion scheitert.";});
	}

	@AfterAll
	static void tearDown() {
		System.out.println("afterAll executed.");
	} 
}
