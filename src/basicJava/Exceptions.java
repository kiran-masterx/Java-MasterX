package basicJava;

public class Exceptions {

	public static void main(String[] args) {
		try {
			int j = 20 / 5;
			System.out.println(j);
			String s = null;
			s.charAt(2);
			
			}catch(ArithmeticException e) {
				System.out.println("The exception is -> " + e);
				System.out.println(e.getMessage());
			
			}catch(NullPointerException e1) {
				System.out.println("The exception is -> " + e1);
				System.out.println(e1.getMessage());			
			}

//			}catch(Exception e) {
//				System.out.println("The exception is -> " + e);
//				System.out.println(e.getMessage());			
//		}

	}

}
	
	
