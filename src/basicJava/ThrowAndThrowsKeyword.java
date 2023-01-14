package basicJava;

public class ThrowAndThrowsKeyword {

	public static void main(String[] args) {
		//throw keyword
//		int i = 10 / 0;
//		String s = null;
//		throw new NullPointerException();
		
		try {
			m1();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("hi");
	}
	
	//throws keyword
	public static void m1() throws ArithmeticException{
		int i = 10 / 0;
		String s = null;
		s.charAt(1);
	}

}
