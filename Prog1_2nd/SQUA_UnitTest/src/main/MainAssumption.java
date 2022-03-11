package main;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainAssumption {
	MainAssumption obj;
	
	@BeforeAll
	static void setup() {
		System.out.println("beforeAll annotation"); 
	}
	
	@BeforeEach
	void beforeEachMethod() {
		obj = new MainAssumption();
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void firstAssumption() {
		assumeTrue(3 == (2+1), "falsch !");
		assertTrue(1+2 == 3, "1+2 != 4"); 
	}
	
	@AfterAll
	static void tearDown() {
		System.out.println("afterAll annotation.");
	}
	
	public static void main(String[] args) {
		MainAssumption o = new MainAssumption();
		o.firstAssumption();
	}

}
