

/**
 * Enumeration is a collection of values that we want to fix up for a variable
 * Example: days (sunday, monday..)
 * this will allow us to define a set of constants
 * 
 *
 */
public class Enumeration {
	
	/**
	 * enums should be decalred as a member of the class.
	 * this is implicitly set as final
	 * there is no need to specify the static keyword either
	 */
	
	public enum Office_Days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
		Office_Days() {
			System.out.println("Hi, in Enum");
		}
	};
	
	public enum Week_Days { 
		MONDAY(1) {
			
			public void giveMessage() {
				System.out.println("My day is MONDAY");
			}
			
		}, TUESDAY(2) {
			
			public void giveMessage() {
				System.out.println("My day is TUESDAY");
			}
		}, WEDNESDAY(3) {
			
			public void giveMessage() {
				System.out.println("My day is WEDNESDAY");
			}
		}, THURSDAY(4) {
			
			public void giveMessage() {
				System.out.println("My day is THURSDAY");
			}
		}, FRIDAY(5) {
		
			public void giveMessage() {
				System.out.println("My day is FRIDAY");
			}
		};
		private int day_no;
		private Week_Days(int d) {
			day_no = d;
			System.out.println("Hi, Weekday");
		}
		
		public int getDayNo() {
			return day_no;
		}
		
		/**
		 * because we added an abstract method here, now every constant in the Enum
		 * must implement the abstract method
		 */
		public abstract void giveMessage();
	}

	public static void main(String[] args) {
		
		System.out.println(Office_Days.TUESDAY);
		/**
		 * Since we have 5 constants in the enum, the constructor will execute 5 times and execute
		 * the output "Hi, in Enum" 5 times
		 */
		// TODO Auto-generated method stub
		System.out.println(Office_Days.MONDAY.name());
		System.out.println(Office_Days.MONDAY);
		
		Office_Days today = Office_Days.FRIDAY;
		
		if(today.equals(Office_Days.MONDAY)) {
			System.out.println("It is Monday");
		} else {
			System.out.println("It is not a Monday");
		}
		
		switch (today) {
			case MONDAY: System.out.println("It is Monday");
			break;
			case TUESDAY: System.out.println("It is TUESDAY");
			break;
			case WEDNESDAY: System.out.println("It is WEDNESDAY");
			break;
			case THURSDAY: System.out.println("It is THURSDAY");
			break;
			case FRIDAY: System.out.println("It is FRIDAY");
			break;
			default: 
				System.out.println("It is a weekend");
		}
		
		//Iterate through the values of Enum
		for(Office_Days myDays:Office_Days.values()) {
			System.out.println(" day is " + myDays);
		}
		
		Office_Days aDay = Office_Days.valueOf("TUESDAY");
		
		if(aDay==Office_Days.TUESDAY) {
			System.out.println("Got it!!");
		}
		
		Week_Days myDays = Week_Days.FRIDAY;
		System.out.println("day\'s no in the week is " +myDays.getDayNo());
		myDays.giveMessage();
	}

}
