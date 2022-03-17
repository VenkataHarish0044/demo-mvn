package in.stackroute;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathTest {
	
	private Math math;
	
	@BeforeEach
	public void setUp() {
		math = new Math();
	}
	
	@AfterEach
	public void tearDown() {
		math = null;
	}
	
	@Test
	@DisplayName("Test to verify the sum() of Math class")
	public void testAdd() {
		assertEquals(12, math.add(5, 7));
	}
	
	@Test
	@DisplayName("Test to verify the multiply() of Math class")
	public void testMultiply() {
		assertEquals(25, math.multiply(5, 5));
	}
	
}
