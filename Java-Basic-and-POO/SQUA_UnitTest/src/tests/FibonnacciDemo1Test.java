package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.*;

class FibonnacciDemo1Test {

	static int n ;
	
	@BeforeAll
	public static void beforeclass() {
		System.out.println("@BeforeAll");
		n = 10;
	}
	
	@BeforeEach
	public void setUpBeforeEach() {
		System.out.println("@BeforeEach fibo");
	}
	
	@Test
	void testFibonacci() {
		//fail("Not yet implemented"); 
		
		assertTimeout( Duration.ofMillis(1000), () -> { 
			System.out.println("-------------> fibo("+ n + ") = "+ FibonnacciDemo1.fibonacci(n));
			return FibonnacciDemo1.fibonacci(n);
		});
	}
	
	@AfterEach
	void tearThis() {
		System.out.println("@afterEach fibo");
	}
	
	@AfterAll
	public static void tear() {
		System.out.println("@AfterAll");
	}

}
