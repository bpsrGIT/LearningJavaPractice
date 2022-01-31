package Practice;

public class ArrayString {
	
	static String[] days;
	static String[] reverseDays;

	ArrayString(String... strings){
		days = strings;
	}
	
	//LONG STRING
	public void longestString() {
		String longDay = "";
		for(int i = 0; i < days.length; i++) {
			if(days[i].length() > longDay.length()) {
				longDay = days[i];
			}
		}
		System.out.println(longDay);
	}
	
	public void reverseDays() {
        for(int i = days.length-1; i>=0; i--) {
        	System.out.print(days[i] + "  ");
//        	for(int j = 0; j < days.length; j++) {
//        		reverseDays[j] = days[i];
//        	}
        	
        }
        System.out.println(reverseDays);
	}

	public static String[] getDays() {
		return days;
	}

	public static void setDays(String[] days) {
		ArrayString.days = days;
	}

	public static String[] getReverseDays() {
		return reverseDays;
	}

	public static void setReverseDays(String[] reverseDays) {
		ArrayString.reverseDays = reverseDays;
	}
	
	
}
