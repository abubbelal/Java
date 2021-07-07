
public class objectType {
	
	static void show(abc2 a) { 
		
		if(a instanceof abc2) {
			System.out.println("A belongs to class abc2");
		} else if (a instanceof dd2) {
			System.out.println("A belongs to class dd2");
		}else {
			System.out.println("A belongs to class ee2");
		}
		
		if(a.getClass()==abc2.class) {
			System.out.println("A is an instance of abc2");
		} else if (a.getClass()==dd2.class) {
			System.out.println("A is an instance of dd2");
		} else {
			System.out.println("A is an instance of ee2");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show(new abc2());
		System.out.println("check1 ###########");
		show(new dd2());
		System.out.println("check2 ###########");
		show(new ee2());
		System.out.println("check3 ###########");
		
		/**
		 * They all will belong to abc2 because the subclass is inheriting from the base class
		 * using the instanceof operator cannot be used when there are inheritance like this. 
		 * the subclass will belong to the baseclass
		 * 
		 * another way to go about this is to check for the subclass first and then the baseclass
		 * 
		 * or we can also use the getClass method
		 */
	}

}

class abc2 {
	
}


class dd2 extends abc2 {
	
}

class ee2 extends abc2 {
	
}