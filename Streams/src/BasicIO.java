import java.io.IOException;

public class BasicIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * inputting text through command line using system.in
		 */
		
//		System.out.println("enter a number: ");
//		
//		int a = 0;
//		try {
//		a = System.in.read();
//			System.out.println("you entered: " + (char)a);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		byte b[]= new byte[5]; 
		System.out.println("Enter Another Number: ");
		try {
			System.in.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String c = new String(b);
		int i = Integer.parseInt(c.trim()); //trim will remove /r/n
		System.out.println(i);
		
		
		System.out.println("Enter a third number: ");
		byte bb[] = new byte[5];
		try {
			System.in.read(bb);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String cc = new String(bb);
//		int ii = Integer.parseInt(cc.trim());
		System.out.println("new no is: " + cc);
	}
	
	
	/**
	 * 
	 * Basic IO in JAVA
	 * 
	 * Java uses Streams for Input and output
	 * 
	 * Stream makes it easier to switch between sources as well
	 * 		for example switching from a filestream to a network stream 
	 * Streams are source independent
	 * 
	 * 
	 * There are two types of Streams
	 * 
	 * Byte Stream:
	 * 	reads data in Bytes, really good for images, sound, larger files
	 * 
	 * Character Stream:
	 * 	works really well with text data 
	 * 
	 * 
	 * Classes
	 * Reader, Writer
	 * 		InputStream is the top class for input stream
	 * 		OutputStrea is the top class for output stream
	 * 
	 * These two classes are abstract so we use all their sub-classes to 
	 * instantiate a basic IO
	 * 
	 * System.out ... System.in ... System.err
	 */

}
