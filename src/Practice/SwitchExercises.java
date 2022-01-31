package Trial;

import java.util.Scanner;

public class SwitchExercises {

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
			default : return false;
			case 1 : return false;
			case 2 : return true;
			case 3 : return true;
			case 4 : return true;
			case 5 : return true;
			case 6 : return true;
			case 7 : return false;
		}
	}
	
	public static String determineNameOfMonth(int noOfMonth) {
		switch(noOfMonth) {
		default: return "Not valid number";
		case 1: return "January";
		case 2: return "February";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "September";
		case 10: return "October";
		case 11: return "Novermber";
		case 12: return "December";
		}
	}
	
	public static String determineNameOfDay(int dayNumber) {
		switch(dayNumber) {
		default: return "Not a valid number";
		case 1 : return "Sunday";
		case 2 : return "Monday";
		case 3 : return "Tuesday";
		case 4 : return "Wednesday";
		case 5 : return "Thursday";
		case 6 : return "Friday";
		case 7 : return "Saturday";
		}
	}
	
	public static void weekDay(int dayNumber) {
		if(isWeekDay(dayNumber) == false) {
			System.out.println("This is not a week day");
		} else if (isWeekDay(dayNumber) == true){
			System.out.println("This is a week day");
		} else {
			System.out.println("Cannot determine the day");
		}
	}
	
	public static void determineDay(int dayNumber) {
		System.out.println("The number you entered is " + dayNumber);
		System.out.println("This is a " + determineNameOfDay(dayNumber));
		weekDay(dayNumber);
	}
	
	public static int day1;
	public static int month1;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day no. then month no.");
		day1 = scanner.nextInt();
		month1 = scanner.nextInt();
		
		determineDay(day1);
		System.out.println("This is " + determineNameOfMonth(month1));

	}

}
