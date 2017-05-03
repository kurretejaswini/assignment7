package world;

import static org.junit.Assert.*;
import org.junit.Test;

import world.Bicycle;
import world.IBicycle;

public class BicycleTest {

	@Test
	public void decreseSpeedTest() {
		IBicycle b = new Bicycle(2);
		b.increaseSpeed();
		b.decreaseSpeed();
		b.decreaseSpeed();
		b.decreaseSpeed();
		boolean result = b.isMoving();
		assertEquals(false, result);
	}

	public void increaseSpeedTest() {
		IBicycle b = new Bicycle(-1);
		b.decreaseSpeed();
		b.increaseSpeed();
		b.increaseSpeed();
		boolean result = b.isMoving();
		assertEquals(false, result);

	}

	public void decreaseAndIncreaseSpeedTest() {
		IBicycle b = new Bicycle(-10);
		b.decreaseSpeed();
		b.increaseSpeed();
		b.increaseSpeed();
		boolean result = b.isMoving();
		assertEquals(false, result);

	}

	public void isMovingTest() {
		IBicycle b = new Bicycle(0);
		boolean result = b.isMoving();
		assertEquals(false, result);

	}

	
}
