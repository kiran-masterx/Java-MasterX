package InterviewQuestions;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		//1. Without using any other variable
		int a = 100;
		int b = 20; 
		b = a + b; //b = 120
		a = b - a; //a = 20
		b = b - a; // 120 - -20 = 100
		System.out.println("The latest value of a is : " + a + " & b is : "+ b);
		
		//2. With third variable
		int c = a; 	  // c = 20 
		a = b;		 // a = 100
		b = c; 		// b = 20
		System.out.println("The latest value of a is : " + a + " & b is : "+ b);

	}

}
