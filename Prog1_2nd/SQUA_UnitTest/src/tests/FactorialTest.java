package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import main.Factorial;
//import main.Factorial.java;

public class FactorialTest 
{
	@BeforeAll
	public static void setUpBeforeAll() {
		System.out.println("@BeforeAll executed");
	}
//	
//	@BeforeEach
//	public void setUpBeforeEach() {
//		System.out.println("@BeforeEach executed");
//	}
//	
//	@Tag("Factorial")
	@Test
	public void testFactorial(TestInfo ti) { 

		
		assertTrue(120 == Factorial.fact(5));
		System.out.println("Tag(s): " + ti.getTags());
	}
	
//	@AfterEach
//	public void tearThis() {
//		System.out.println("@AfterEach executed");
//	}
	
	@AfterAll
	public void tear() {
		System.out.println("@AfterAll executed");
	}

}
