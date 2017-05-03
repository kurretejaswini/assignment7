package world;

public class Bicycle implements IBicycle {
	int currentSpeed;
	boolean moving;

	public Bicycle() {
		moving = false;
		currentSpeed = 0;
	}

	public Bicycle(int speed) {
		if (speed > 0) {
			moving = true;
			currentSpeed = speed;
		} else {
			moving = false;
			currentSpeed = 0;
		}
	}

	public void increaseSpeed() {
		if (!moving) {
			moving = true;
			currentSpeed++;
		}
	}

	public void decreaseSpeed() {
		if (moving) {
			currentSpeed--;
		if(currentSpeed==0)
		
			moving=false;
		}

	}

	public boolean isMoving() {
		return moving;
	}


}
