package world;
import world.IQuad;


import org.junit.Test;

import world.Quad;
import static org.junit.Assert.*;
import org.junit.Test;

public class QuadTest {
	@Test
	public void firstCtest() {
		IQuad q=new Quad();
		IQuad q2=q.solveBiquadratic(1, 3, 0);
		double x1=q2.getX1();
		double x2=q2.getX2();
		double x3=q2.getX3();
		double x4=q2.getX4();
		assertEquals(0,x1,0);
	    assertEquals(0,x2,0);
		assertEquals(-3,x3,0);
		assertEquals(3,x4,0);
	}
	public void test2() {
		IQuad q=new Quad();
		IQuad q2=q.solveBiquadratic(1, 5, 6);
		double x1=q2.getX1();
		double x2=q2.getX2();
		double x3=q2.getX3();
		double x4=q2.getX4();
		assertEquals(0,x1,0);
	    assertEquals(-3,x2,0);
		assertEquals(3,x3,0);
		assertEquals(-2,x4,0);
	}


	
}
