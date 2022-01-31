package Trial;

import java.util.Scanner;

public class MenuRunner {
	
	static int number1;
	static int number2;
	static int operationNumber;
	
	static int operationFunction() {
		if(operationNumber == 1) {
			return number1 + number2;
		} else if (operationNumber == 2) {
			return number1 - number2;
		} else if (operationNumber == 3) {
			return number1 / number2;
		} else {
			return number1 * number2;
		}
	}
	
	private static int operationFunctionSwitch() {
		switch(operationNumber) {
		case 1: return number1 + number2; 
		case 2: return number1 - number2; 
		case 3: return number1 / number2; 
		case 4: return number1 * number2; 
		default: return 00;
		}
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number1: ");
		
		number1 = scanner.nextInt();
		
		System.out.println("The number you entered is " + number1);
		System.out.println("Enter number2: ");
		
		number2 = scanner.nextInt();
		
		System.out.println("the number you entered is " + number2);
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		
		operationNumber = scanner.nextInt();
		
		System.out.println("the answer is " + operationFunctionSwitch());

	}

}
