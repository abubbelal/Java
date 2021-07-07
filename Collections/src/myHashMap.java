import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;



public class myHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * adds a pair at a time, key value pair
		 */
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		HashMap<String, Vector> hm2 = new HashMap<String, Vector>();
		Vector<String> v1 = new Vector<String>();
		v1.add("111111");
		v1.add("222222");
		v1.add("333333");
		hm2.put("user1", v1);
		
		Vector<String> v2 = new Vector<String>();
		v2.add("000000");
		v2.add("444444");
		v2.add("555555");
		hm2.put("user2", v2);
		
		
		hm.put("Java", "language");
		hm.put("abcd", "letters");
		hm.put("12345", "numbers");
		hm.put("apple", "fruit");
		
		
		System.out.println(hm);
		System.out.println(hm2);
		
		HashMap<String, String> stHashMap = new HashMap<String, String>();
		stHashMap.put("one", "hello");
		stHashMap.put("two", "hi");
		stHashMap.put("three", "bye");
		
		/**
		 * this value comparison should be direcctly inside the value object
		 * it cannot be inside a vector or another object type, because it will be compared
		 * to the vector objecct or another object the value being compared must be directly 
		 * in the value column
		 */
		if(stHashMap.containsValue("hi")) {
			System.out.println("It contains");
		}else {
			System.out.println("It does not contain");
		}
		
		
		Set<Map.Entry<String, String>> s = stHashMap.entrySet();
		Iterator<Map.Entry<String,String>> isIterator = s.iterator();
		while(isIterator.hasNext()) {
			Map.Entry<String, String> mp = isIterator.next();
			String keyString = mp.getKey();
			String valString = mp.getValue();
			System.out.println("Key is: \t" + keyString + "\tvalue is: \t" + valString);
		}
		
		if (hm2.containsKey("user1")) {
			System.out.println("Values for user1 are :\n");
			Vector<String> v = hm2.get("user1");
			for(String ph:v) {
				System.out.println(ph + "\n");
			}
		}
		
		
		
		if (hm.containsKey("apple")) {
			System.out.println("It contains and the fruit is: " + hm.get("apple"));
		} else {
			System.out.println("No such key in the map");
		}
		
		Set<String> s2 = hm.keySet();
		System.out.println(s2);
		
		Iterator<String> i = s2.iterator();
		while (i.hasNext()) {
			String key = i.next();
			String val = hm.get(key);
			
			System.out.println("Key is " + key + " and value is: " + val);
		}
	}

}
