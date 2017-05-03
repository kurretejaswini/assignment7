package world;

import world.IQuadratic;
import static org.junit.Assert.*;

import org.junit.Test;

import world.Pair;
import world.Quadratic;


import org.junit.Test;

public class QuadraticTest {

	@Test
	public void test() {
		IQuadratic q=new Quadratic();
		Pair p=q.solveQuadratic(1,3,0);
		double x1=p.getx();
		double x2=p.gety();
		assertEquals(0,x1,0);
		assertEquals(-3,x2,0);
		
	}
	public void test2() {
		IQuadratic q=new Quadratic();
		Pair p=q.solveQuadratic(2,6,0);
		double x1=p.getx();
		double x2=p.gety();
		assertEquals(0,x1,0);
		assertEquals(-3,x2,0);
		
	}
	public void test3() {
		IQuadratic q=new Quadratic();
		Pair p=q.solveQuadratic(3,9,1);
		double x1=p.getx();
		double x2=p.gety();
		assertEquals(0,x1,0);
		assertEquals(-3,x2,0);
		
	}
}

	
