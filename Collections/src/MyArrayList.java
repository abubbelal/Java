import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * array lists are implemented as arrays while linked list
		 * is implemented as nodes
		 * 
		 * we dont have at first or at last like linkedlist
		 * but we can add at a particular index
		 * 
		 * we can also remove at any index
		 * 
		 * there is no push or pop in arraylist
		 */
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("One");
		aList.add("Second");
		aList.add("third");
		
		System.out.println("Size is : " + aList.size());
		System.out.println(aList);
		
		aList.set(2, "Three");
		System.out.println("Size is : " + aList.size());
		System.out.println(aList);
		
		aList.remove(1);
		System.out.println("Size is : " + aList.size());
		System.out.println(aList);
		
		
		ListIterator<String> listIterator = aList.listIterator();
		
		while(listIterator.hasNext()) {
			String aa = listIterator.next();
			
			if(aa == "Three") {
				String bb = listIterator.previous();
				System.out.println(bb);
				break;
			}
		}
		
		int x = aList.indexOf("Three");
		int lx = aList.lastIndexOf("one");
		System.out.println("First index is " + x + " and last index is: " + lx);
		
		String st[] = new String[aList.size()]; 
		aList.toArray(st);
		
		for(String a:st) {
			System.out.println(a);
		}
		
		
		String ss[] = {"1","2","3","4"};
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(Arrays.asList(ss));
		
		al.add("5");
		System.out.println(al);
		
		
	}

}
