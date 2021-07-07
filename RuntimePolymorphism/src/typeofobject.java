
public class typeofobject {
	
	static void show (abc a) {
		
		if(a instanceof dd) {
			System.out.println("The object belongs to dd");
		}
		
		if(a instanceof ee) {
			System.out.println("The object belongs to ee");
		}
		
		Class c = a.getClass();
		System.out.println(c.getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * we can use the instanceof opeartor to determine what class the object belongs to
		 * 
		 * we can also use the Class object to get the name of the class an object belongs to
		 * 
		 */
		
		show(new dd());
		show(new ee());

	}

}


class abc { 
	
}

class dd extends abc { 
	
}

class ee extends abc { 
	
}

