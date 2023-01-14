package InterviewQuestions;

public class VowelAvailableInString {

	public static void main(String[] args) {
		// vowel= [a,e,i,o,u]
		System.out.println(isVowelPresent("Hello"));
	}

	public static boolean isVowelPresent(String s) {
		boolean s1 = s.toLowerCase().matches(".*[aeiou].*");
		return s1;
	}

}
