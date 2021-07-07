
public class InheritingInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new InheritingInnerClass().new ia().show();
		
		
	}
	
	
	class ia {
		void show() { 
			System.out.println("In Show");
		}
	}

}



class ca extends InheritingInnerClass.ia { 
	
	
	ca() {
		// TODO Auto-generated constructor stub
//		super();//this will not work because we need an object of IneritingInnerClass
		//an object of superclass needs to be created beore object of subclass
		new InheritingInnerClass().super();
	}
	
	//we can also pass object of superclass as argument 
	ca(InheritingInnerClass oa) {
		oa.super();
	}
	
	
}