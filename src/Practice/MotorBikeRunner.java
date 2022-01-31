package Practice;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(100);

		ducati.start();
		honda.start();

//		ducati.setSpeed(100);

		ducati.increaseSpeed(100);
		System.out.println(ducati.getSpeed());
		ducati.decreaseSpeed(500);
		System.out.println(ducati.getSpeed());

		honda.increaseSpeed(100);
		System.out.println(honda.getSpeed());

		ducati.setSpeed(20);
		honda.setSpeed(0);
	}
}
