package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import main.Prim;

class PrimTest {

//	@Test
	@ParameterizedTest(name = "{index}: {0}")
	@ValueSource(ints = {3, 11, 19, 31, 41, 53, 1039}) 
	void testIsPrim(int x) { 
		assertTrue( Prim.isPrim( x ) );
	}

}
