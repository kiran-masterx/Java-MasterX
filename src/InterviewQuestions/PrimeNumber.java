package InterviewQuestions;

public class PrimeNumber {

	public static void main(String[] args) {
		// Prime Number: The number which is divisible by 1 and itself.
		// Lowest prime number 2
		System.out.println(isPrimeNumber(37));
		System.out.println(isPrimeNumber(11));
		System.out.println(isPrimeNumber(1));
		findPrimes(50);
		findPrimes(20);
		findPrimes(100);
	}

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) { // 5 = 2,3,4
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Print prime number upto 20
	public static void findPrimes(int uptoThisNumber) {
		int count = 0; 
		for (int i = 0; i <= uptoThisNumber; i++) {
			if (isPrimeNumber(i) == true) {
				System.out.println(i);
				count = count + 1;
			}
		}
		System.out.println("the count of prime number upto " + uptoThisNumber + " is " + count);

	}

}
