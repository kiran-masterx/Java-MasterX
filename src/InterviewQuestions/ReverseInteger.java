package InterviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {
		reverseInt(123456704);
	}

	public static void reverseInt(int num) {
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
	}

}
