package main;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class SampleTest {
	
	private java.util.List emptyList;
	@Before
	public void setUp() {
	emptyList = new java.util.ArrayList();
	}
	@After
	public void tearDown() {
	emptyList = null;
	}
	@Test
	public void testSomeBehavior() {
	assertEquals("Empty list should have 0 elements", 0, emptyList.size());
	}
	
}
