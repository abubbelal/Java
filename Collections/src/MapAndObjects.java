import java.util.HashMap;

public class MapAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Student, String> hm = new HashMap<Student, String>();
		Student a = new Student();
		Student b = new Student();
		
		a.name = "First Name";
		b.name = "First Name";
		
		a.rollNo = 23;
		b.rollNo = 15;
		
		
		if(a.equals(b)) {
			System.out.println("Equal");
		} else {
			System.out.println("Unequal");
		}
		
		System.out.println(a.hashCode() + ", " + b.hashCode());
		
		hm.put(a, "My Object");
		hm.put(b, "My other object");
		System.out.println(hm);
		/**
		 * because the hashmaps are equal it will only showw one object in the 
		 * hashmap
		 * 
		 */
	}

}


class Student {
	
	int rollNo;
	
	String name;
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if(this.name.equals(s.name)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}