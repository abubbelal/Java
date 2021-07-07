
public class intershow2 implements i3,i4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(pie);
		//getting error because java doesnt know if pie is from i3 or i4 
		//or 
		System.out.println(i3.pie);
	}

	@Override
	public void show2() {
		System.out.println("In show method");
	}

}


interface i3 { 
	float pie = 3.14f;
	void show2();
}

interface i4 { 
	float pie = 3.145f;
	void show2();
}