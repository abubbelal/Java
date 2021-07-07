import java.io.Console;
import java.util.Scanner;

public class HandlingDataScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter your information into "
				+ "the form Name;Course;Status;");
		
		Scanner sc = new Scanner(System.in).useDelimiter(";");
		
		if(sc.hasNext())
			System.out.println("Name is: " +sc.next());
		else 
			System.out.println("Name is missing");
		
		if(sc.hasNextInt())
			System.out.println("Course No is: " +sc.nextInt());
		else 
			System.out.println("Course No is missing");
		
		if(sc.hasNextBoolean())
			System.out.println("Status is: " + sc.nextBoolean());
		else 
			System.out.println("Status is missing");
	}

}
