package basicJava;

public class finalConcept {

	public static void main(String[] args) {
//		final int i = 10; 
//		i = 20;
//		System.out.println(i);
		
		try {
			int i = 12 / 0; 
			System.out.println("open a file A");
		}catch(Exception e) {
			System.out.println("Open file B");
			System.out.println(e);
		}finally {
			System.out.println("Close the opened file, which may be A or B");
		}
	}

}
