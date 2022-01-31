package Practice;

public class MotorBike {
	// state
	private int speed;

//	 Constructor = should be named same with the class
	MotorBike() {
		this(0);
	};

	MotorBike(int speed) {
		this.speed = speed;
	};

	// behavior
//	method
//	output	- void
//	input - int speed
//	name - setSpeed
	void start() {
		System.out.println("Bike started");
	};

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

//	Other option
//	public void decreaseSpeed(int howMuch) {
//		if (this.speed - howMuch < 0) {
//			this.speed = 0;
//			System.out.println("The bike stopped.");
//
//		} else {
//			this.speed = this.speed - howMuch;
//		}
//	}

	void accelerate() {

	};

}
