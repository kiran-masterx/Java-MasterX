package basicJava;

public class JavaLoops {

	public static void main(String[] args) {
		String s = "Hi, I am QA and QA loves Automation Testing";
		//1. Length of the string
		System.out.println("The length of string is: " + s.length());
		//2. Getting the character at 9th index. 
		System.out.println("the character at 9th index is: " + s.charAt(9));
		//3. Getting the index of particular characters. 
		System.out.println("the index of Q is : " + s.indexOf('Q'));
		//4. Ignore the first Q and start again from 0th index to get the index of next Q
		System.out.println("Ignore the first Q and start again from 0th index to get the index of next Q");
		System.out.println(s.indexOf('Q', 10));
		System.out.println(s.indexOf('Q', s.indexOf('Q') +1));
		//5. Index of a word. 
		System.out.println("Index of word loves is: "  + s.indexOf("loves"));
		//6. Getting the index of word which is not in our string
		//If the word is not in the String then it will give -1 in the console. 
		System.out.println(s.indexOf("Tester"));
		//7. comparing two strings equal or not. 
		String s1 = "Hi, I am Tester and Tester loves Automation Testing";
		//If it is equal then it will return true otherwise false.
		System.out.println(s.equals(s1));
		//8. Comparing two strings in different cases. 
		String a = "Java";
		String b = "java";
		System.out.println("Verifying the Strings are equal or not without ignoring the lowercase or uppercase letters : " + a.equals(b));
		System.out.println("Verifying the Strings are equal or not by ignoring the lowercase or uppercase letters : " + a.equalsIgnoreCase(b));
		//9. Substrings: Small Parts of the strings
		System.out.println(s.substring(4)); // Passing the begin index. 
		System.out.println(s.substring(4, 11)); // Passing the begin and end index
		//10. String trim function: It will remove the uneccesary blank spaces from start and end
		String c = "     test@123   ";
		System.out.println(c.trim());
		//11. String replace function: it will replace the particular characters  from the string
		String d = "31/06/2015";
		System.out.println(d.replace("/", "-"));	
//		int age = 17;
//		if (age>=18) {
//			System.out.println("The person is adult");
//		}else {
//			System.out.println("The person is not adult");
//		}
		
		    //Declaring a variable for switch expression  
		    int number=20;  
		    //Switch expression  
		    switch(number){  
		    //Case statements  
		    case 10: System.out.println("10");  
		    break;  
		    case 20: System.out.println("20");  
		    break;  
		    case 30: System.out.println("30");  
		    break;  
		    //Default case statement  
		    default:System.out.println("Not in 10, 20 or 30");  
		    }  

	}
}
