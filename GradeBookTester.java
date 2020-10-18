import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
GradeBook s1, s2;
	@BeforeEach
	void setUp() throws Exception {
		s1 = new GradeBook(5);
		s2 = new GradeBook(5);
		s1.addScore(10);
		s1.addScore(20);
		s2.addScore(30);
		s2.addScore(40);
		s2.addScore(50);
		


	}

	@AfterEach
	void tearDown() throws Exception {
		s1 = null;
		s2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(s1.toString().equals("10.0 20.0 "));
		assertTrue(s2.toString().equals("30.0 40.0 50.0 "));
	}

	@Test
	void testSum() {
		assertEquals(30, s1.sum());
		//assertEquals(150, s2.sum());

	}

	@Test
	void testMinimum() {
		assertEquals(10, s1.minimum());
		assertEquals(30, s2.minimum());

	}

	@Test
	void testFinalScore() {
		assertEquals(20, s1.finalScore());
		assertEquals(90, s2.finalScore());
	}

}
