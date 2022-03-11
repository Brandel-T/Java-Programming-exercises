package calculate;

import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName; 
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource; 

class CalculateTest { 
	
	Calculate calc; 
	
	@BeforeEach
	void setUpBeforeEach() {
		calc = new Calculate();
	} 
	
	@ParameterizedTest(name = "{index} : {0} * {1}")
	@CsvSource(value = {"2,3", "3,4"}) 
	void testMult(int a, int b) {
		assertEquals(a*b, new Calculate().mult(a, b));
	}
	 
	@DisplayName("Addition")
	@ParameterizedTest
	@CsvSource(value = {"2, 3", "4, 4", "2, 4"})
	void testAdd(int a, int b) {
		 assertEquals(a+b , calc.add(a, b));
	} 
		 
	@DisplayName("Divide") 
	@ParameterizedTest(name = "{index}: {0} = {1} / {2}") 
	@CsvSource({"1, 2, 2", "4, 16, 4", "3, 9, 3"})
	void testDiv(int res, int num, int denom) {
		assertTrue(res == calc.div(num, denom));		
		assertThrows(ArithmeticException.class, () -> calc.div(num, 0));		
	} 
}
