package InterviewQuestions;

public class ArrayReverse {

	public static void main(String[] args) {
		Object[] arr = { "ABC", "PQR", 10.1, true, "DEF", "GHIGGF", 100 };
		int length = arr.length;
		for (int i = length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
