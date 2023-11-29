
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class GradebookTester {
	
	GradeBook g1 = new GradeBook(5);
	GradeBook g2 = new GradeBook(5);

	@BeforeEach
	void setUp() throws Exception {
		
		g1.addScore(90.0);
		g1.addScore(50.0);
		g1.addScore(10.0);
		
		g2.addScore(40.0);
		g2.addScore(70.0);
		g2.addScore(60.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		g1 = null;
		g2 = null;
	}
	
	@Test
	public void testAddScore(){
	
		assertTrue(g1.toString().equals("90.0 50.0 10.0"));
		assertTrue(g2.toString().equals("30.0 70.0 60.0"));
		
		assertEquals(4, g1.getScoresSize());
		assertEquals(5, g2.getScoresSize());
	}

	@Test
	public void testSum(){
	
		assertEquals(200.0, g1.sum(), .0001);
		assertEquals(300.0, g2.sum(), .0001);
	}

	@Test
	public void testMinimum(){
	
		assertEquals(10.0, g1.minimum(), .0001);
		assertEquals(50.0, g2.minimum(), .0001);
	}

	@Test
	public void testFinalScore(){

		assertEquals(400, g1.finalScore(), .0001);
		assertEquals(300, g2.finalScore(), .0001);
	}

}
