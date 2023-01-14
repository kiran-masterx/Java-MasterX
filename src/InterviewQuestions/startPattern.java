package InterviewQuestions;

public class startPattern {

	public static void main(String[] args) {
// 1.
//		*
//		**
//		***
//		****
		for (int i = 0; i <= 4; i++) { // 0 1 2
			for (int j = 0; j <= i; j++) { // 0 1 2
				System.out.print("*");
			}
			System.out.println();
		}
//	2.
//		****
//		***
//		**
//		*	
		System.out.println();
		for (int i = 0; i <= 4; i++) {  // 0 1 2
			for (int j = 4; j >= i; j--) { // 0 1 2
				System.out.print("*");
			}
			System.out.println();
		}

//		3.
//		   *
//		  **
//		 ***
//		****	
//		System.out.println();
		for (int i = 1; i <= 5; i++) { // 0 1 2
			for (int j = 4; j >= i; j--) { // 0 1 2
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("1");
			}
			System.out.println();
		}

	}

}
