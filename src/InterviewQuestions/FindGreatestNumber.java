package InterviewQuestions;

public class FindGreatestNumber {

	public static void main(String[] args) {
		findGreatestNumber(100, 50, 30);
	}

	public static void findGreatestNumber(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("a is greatest and the value is " + a);
		} else if (b > c) {
			System.out.println("b is greatest and the value is " + b);
		} else {
			System.out.println("c is greatest and the value is " + c);
		}
	}

}
