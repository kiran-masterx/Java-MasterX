package basicJava;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int age = 18;
		if(age >= 18) { // age should be 18 or more than 18
			System.out.println("the user is adult");
		}else {
			System.out.println("he is not an adult");
		}
		
		
		int marks = 99;
		
		if(marks<35) {											//less than 35
			System.out.println("failed!");			
		}else if (marks >= 35 && marks < 55) {					// greater than or equal to 35 and less than 55
			System.out.println("passed with second class!");		
		}else if (marks >= 55 && marks < 65) {					// greater than or equal to 55 and less than 65
			System.out.println("passed with first class!");
		}else if (marks >= 65 || marks <= 100) {				// greater than or equal to 65 or less than or equal to 100
			System.out.println("passed with distinction");		
		}else {
			System.out.println("Invalid entry!");
		}
		
		// && -> All conditions should be satisfied
		// || -> Any of the condition should get satisfied
		
		System.out.println("Exited from if else statments");
		
		
	}

}
