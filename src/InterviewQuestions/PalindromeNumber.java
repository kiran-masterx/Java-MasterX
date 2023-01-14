package InterviewQuestions;

public class PalindromeNumber {

	public static void main(String[] args) {
		// Palindrome number is a number which is same after reverse. 
		// Eg. 151, 454, 34543
		int reminder; 
		int sum = 0; 
		int temporary; 
		
		int n = 34543; //It is checked for condition
		temporary = n; // temporary = 34543
		
		// '%' --> Reminder eg. 17%5 = 2 
		//'%' --> it will give the decimal places as well. 
		// '/' --> Actual division eg. 17/5 = 3.4
		while(n > 0) {
			reminder = n % 10; //It will give the reminder  // 151 % 10 = 1   --> 5.1  --> 1.5
			sum = (sum*10) + reminder;						// (0*10) + 1 = 1 --> 15 --> (15*10)+ 1 = 151
			n = n/10; 										// 151/10 = 15.1  --> 1.5 --> 0
		}
//		double a = 1.5;
//		int b = 10; 
//		System.out.println(a%b);
//		//10/2 = 5, 10%2 = 0
//		//11/2 = 5.5, 11%2 = 1
		
		if(temporary == sum) {
			System.out.println(sum + " is a palindrome number");
		}else {
			System.out.println("Not palindrome");
		}
		
		
		

	}

}
