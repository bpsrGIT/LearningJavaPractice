package Practice;

public class ForLoopExercise {
	
	public static void main(String[] args) {
		ForLoopExercise number = new ForLoopExercise(9);
		System.out.println(number.isPrime());
		System.out.println(number.sumUpToN());
		System.out.println(number.sumOfDivisors());
		number.printNumberTriangle();
	}
	
	static int numInput;

	ForLoopExercise(int num){
		numInput = num;
	}
	
	public boolean isPrime() {
		for(int i = 1; i <= numInput; i= i+2) {
			if(i == numInput) {
				return true;
			}
		}
		return false;
	}
	
	public int sumUpToN() {
		int num = 0;
		for(int i = 0; i <= numInput; i++) {
			num = num + i;
		}
		return num;
	}
	
	public int sumOfDivisors() {
		int num = 0;
		for(int i = 1; i <= numInput; i++) {
			if(numInput%i == 0 && i != 1 && i != numInput) {
				num = num + i;
			}
		}
		return num;
	}
	
//	my solution
//	public static void printNumberTriangle() {
//		String num = "";
//		for (int i = 1; i <= numInput; i++) {
//			num = num + i + " ";
//			System.out.println(num); 
//		}
//	}
	
	public static void printNumberTriangle() {

		for (int i = 1; i <= numInput; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	

}
