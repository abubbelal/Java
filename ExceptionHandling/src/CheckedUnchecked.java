
public class CheckedUnchecked {
	
	void show() {
		show1();
	}
	
	void show1() throws ArithmeticException {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckedUnchecked().show();
	}

}
/**
------ Unchecked exceptions are runtime exception 
you don't need to deal with the exception
you can leave them off without any catch blocks 

------ Checked exception 
These are Exceptions under the Exception class and must be dealt with
they are also referred to as compile time exception

*/ 