import java.io.Console;

public class ConsoleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Console c = System.console();
		
		System.out.println("Enter your name: ");
		String name = c.readLine();
		
		System.out.println("Enter course no: ");
		int course = Integer.parseInt(c.readLine().trim());
		
		System.out.println("Enter your password: ");
		char cc[]= c.readPassword();
		
		System.out.println("Information entered is\n NAME:\t" + name + "\nCOURSE:\t" +course + 
				"\nPASSWORD:\t"+ new String(cc));
	}

}
