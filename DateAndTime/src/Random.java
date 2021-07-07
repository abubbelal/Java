
public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		java.util.Random r = new java.util.Random();
		
		for (int i = 0; i<5; i++) {
			int no = r.nextInt(100);
			System.out.println(no);
		}
		
		int min = 1;
		int max = 6;
		
		int range = max-min;
		for (int i = 0; i < 6; i++) {
			double d = r.nextDouble(); //get value from 0 - 1
			double dd = max * d; //multiply value (0-1)*6 
			int no = (int) Math.ceil(dd); //round value up
			System.out.println(no);
		}
		
		
	}

}
