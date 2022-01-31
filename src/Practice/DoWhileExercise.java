package Practice;

import java.util.Scanner;

public class DoWhileExercise {

	static String someString = "This is a lot of text again";
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int data = -1;
		int cube = 0;

		
		do {
			if (data != -1) {
				System.out.println("The cube of " + data + " is " + cube);	
			}
			
			System.out.println("Enter a number:");
				
			data = scanner.nextInt();
				
			cube = data*data*data;
				

		} while (data > 0);
		System.out.println("Thank you! Have Fun!");
		
		
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		for(int i=0; i < someString.length(); i++) {
			System.out.println(someString.charAt(i));
		}
	}
	
	
	

	
	
	
}