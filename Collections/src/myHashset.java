import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;



public class myHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * difference between set , linkedlist or list is that
		 * set does not store duplicate elements
		 */
		
		String paraString = "This is my paragraph string, there is no duplicate";
		
		StringTokenizer st = new StringTokenizer(paraString," ");
		
//		HashSet<String> hs = new HashSet<String>();
		TreeSet<String> hs = new TreeSet<String>(new mycomp());
		
		while (st.hasMoreTokens()) {
			String a = st.nextToken();
			hs.add(a);
		}
		
		System.out.println("No. of unique words: " + hs.size());
		System.out.println(hs);
		
		
	}

}


class mycomp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
//		return o1.compareTo(o2);
	}
}