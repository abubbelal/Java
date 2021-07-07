import java.util.Vector;


public class WhyCollections {

	
	/**
	 * When we use arrays we have to provide the size at point of creation of the array
	 * but if we don't know the amount of data from the user
	 * for cases where we are not sure about how many elements we need
	 * we can use collections
	 * 
	 * 
	 * but collections are limited because they can only store objects
	 * 
	 * collections -> objects -> Object -> subclasses
	 * we cannot enter data types in collections
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vectors
		/**
		 * At the time of creation of a vector it has both size and capacity
		 */
		Vector v = new Vector();
		v.add("Java");

		//size is the actual number of elements the vector is holding
		//capacity is the maximum number of elements it can store at the current position
		//Capacity starts off at 10 by default, and doubles each time --> 10->20->40->80->...
		System.out.println("No of elements: " + v.size()); //1
		System.out.println("No of total elements it can store: " + v.capacity());//10
		
		v.add("Java1");
		v.add("Java1");
		v.add("Java1");
		v.add("Java1");
		v.add("Java1");
		v.add("Java1");
		v.add("Java1");
		v.add("Java1");
		v.add("Java1");
		v.add("Java1");
		System.out.println("No of elements: " + v.size()); //11
		System.out.println("No of total elements it can store: " + v.capacity());//20
		
		/**
		 * When we add a datatype like 1 which is int will automatically by changed to 
		 * the wrapper class version int --> Integer
		 */
		
		v.add(1);
		//above line is same as 
		v.add(new Integer(4));
		v.add(new Float(25.5f));
		v.add(new Object());
		
		System.out.println(v);
		
		
		Vector v2 = new Vector();
		v2.add("Java");
		v2.add("Java");
		v2.add("Java");
		v2.add("Java");
		v2.add("Java");
		v2.add("Java");
		v2.add(1);
		v2.add(2);
		v2.add(3);
		v2.add(4);
		v2.add(5);
		v2.add(6);
		
		for (Object o:v) {
			if(o instanceof String) {				
				String st = (String)o;
				System.out.println(st);
			}
			if(o instanceof Integer) {
				Integer oo = (Integer)o;
				System.out.println(oo.intValue());
			}
		}
		
		//above for loop is similar to 
		for (int i = 0; i < v.size(); ++i ) {
			Object o = v.get(i);
			if(o instanceof String) {				
				String st = (String)o;
				System.out.println(st);
			}
			if(o instanceof Integer) {
				Integer oo = (Integer)o;
				System.out.println(oo.intValue());
			}
		}
		
		/**
		 * It's always good to know the data types stored in a vector 
		 * we can make it easier by declaring the data type we need
		 */
		Vector<String> vs = new Vector<String>();
		vs.add("Java String");
		vs.add("Java String");
		vs.add("Java String");
		vs.add("Java String");
		vs.add("Java String");
		vs.add("Java String");
		
//		vs.add(23); //any other data type will generate an error
		
		for(int i = 0; i < vs.size(); ++i) {
			String as = vs.get(i); //notice there is no need to type cast if we already know the data type
			System.out.println(as);
		}
	}

}
