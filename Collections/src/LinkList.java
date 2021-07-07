import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * you can add elements at any index in between the elements
		 */
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("One");
		ll.add("Two");
		ll.add("Three");
		
		System.out.println("Size of list: " + ll.size());
		System.out.println(ll);
		
		ll.addFirst("First");
		System.out.println("Size of list: " + ll.size());
		ll.addLast("Last");
		System.out.println("Size of list: " + ll.size());
		System.out.println(ll);
		ll.add(2,"New Two");
		System.out.println("Size of list: " + ll.size());
		System.out.println(ll);
		
		ll.set(2, "Switch with another Two");
		System.out.println(ll);
		
		ll.remove("one");
		System.out.println(ll);
		
		ll.pop();
		System.out.println(ll);
		
		ll.push("Two");
		System.out.println(ll);
		
		//how to move through a List 
		ListIterator<String> li = ll.listIterator();
		while (li.hasNext()) {
			String	aa = li.next();
			if (aa == "First") {
				li.remove();
			}
		}
		
		System.out.println("Size of list: " + ll.size());
		System.out.println(ll);
	}

}
