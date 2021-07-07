import java.io.IOException;

public class ThrowProg {
	
	void show() throws Exception {
		for (int i = 1; i < 5; ++i) {
			int x = 10/i;
			if(i == 3) {
//				throw new ArithmeticException();
				throw new IOException(); //new input-output exception
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new ThrowProg().show();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
