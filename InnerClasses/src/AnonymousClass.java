
public class AnonymousClass {
	
	static void show(shape s) { 
		
		s.calarea();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show(new shapesub());
		
		show(new shape()
				{
			{
				
			}
					@Override
					public void calarea() {
						System.out.println("In anonymous class calarea");
					}
				});
		

	}

}


class shapesub implements shape {
	
	@Override
	public void calarea() { 
		System.out.println("In calarea of shapesub");
	}
}


interface shape {
	void calarea();
}