package InterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Selenium";
		//Storing the length in a varible
		int length = s.length();
//		System.out.println(length);
		//Creating a empty variable, to store the reverse string
		String rev = "";
		for(int i = length-1; i>=0; i--) {
			rev = rev + s.charAt(i);  
		}
		System.out.println(rev);
	}

}
