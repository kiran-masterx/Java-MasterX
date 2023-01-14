package InterviewQuestions;

public class FactorialNumber {

	public static void main(String[] args) {
		factorialOfNumber(3);
		factorialOfNumber(7);
		factorialOfNumber(4);
		
	}
	
	public static int factorialOfNumber(int number) {
		//Factorial number is the product of that number with every whole number less than the this number upto 1. 
		// 5! == 5*4*3*2*1 = 120
		// 3! == 3*2*1 = 6
		// 100! == 100*99*98......3*2*1
		
		int factorial = 1; 
		int n = number; 
		for(int i = 1; i <= n; i++) {
			factorial = factorial*i;  //1. 1*1=1  2. 1*2=2 3. 2*3=6 4. 6*4= 24 5. 24*5 = 120 
		}
		System.out.println(factorial);
		return factorial;
	}

}
