package basicJava;

public class StringConcatentaion {

	public static void main(String[] args) {
		String s = "Hi, I am QA. I Love Coding!";
		System.out.println(s.length());
		
		String s1 = "I love playing games";
		String s2 = s + s1;
		// '+' -> Concatenation operator
		System.out.println(s2);
		
		
		//concat() method
		String s3 = s.concat(s1);
		System.out.println(s3);
		
		
		// String Manipulation
		String a = "Hi, I am QA. I Love Coding!";
		System.out.println(a.charAt(1));
		System.out.println(a.indexOf('I'));  // char
		System.out.println(a.indexOf('I', 6)); // char, int
		System.out.println(s.indexOf("Love")); // string
		
		
		
	}

}
