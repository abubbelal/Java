import java.io.Console;
import java.util.Scanner;

public class ReadinWithScannerClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter a second number: ");
		int b = sc.nextInt();
		
		System.out.println("The sum of the numbers are: " + (a + b));
		
		
		sc.nextLine(); //we use this to ignore the /n passed down from the input from above
		System.out.println("Enter your name as well: ");
		
		String aa = sc.nextLine(); //can use this to read string data
		System.out.println("The name is: " + aa);
		
		/**
		 * The scanner also works well as a String tokenizer
		 */
		
		System.out.println("Enter your string: ");
		Scanner ns = new Scanner(System.in).useDelimiter(";");
		while(ns.hasNext())
			System.out.println("Next is: " + ns.next());
	}

}
