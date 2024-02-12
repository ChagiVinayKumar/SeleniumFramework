package Demo;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			demo();
		} catch (Exception e) {
			System.out.println("I am inside the exception");
			System.out.print("Message is: "+e.getMessage());
			System.out.println("Cause is: "+e.getCause());
			e.printStackTrace();
		}
	}
		
		public static void demo() throws Exception {
			
				System.out.println("Hello World");
				//throw new ArithmeticException("Not a valid");
				int i=1/0;
				System.out.println("Completed");
		}
}
