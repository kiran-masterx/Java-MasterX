package basicJava;

public class MethodOverloadingConcept {
	
	int i = 10;

	public static void main(String[] args) {
		
		
		MethodOverloadingConcept obj = new MethodOverloadingConcept();
		obj.m1(20);
		obj.m1("Ram", 20);
		obj.m1("Test@123");
		obj.m1(10, "Shyam");
		obj.m1("A ", "B ", "C ");
	}
	
	public int m1(int i) {
		System.out.println("Inside method m1 with one integer parameter");
		System.out.println(i);
		return i;
	}
	
	public void m1(String s) {
		System.out.println("Inside method m1 with one string parameter");
		System.out.println(s);
	}
	
	public void m1(int i, String s) {
		System.out.println("Inside method m1 with one integer and one string resp. parameter");
		System.out.println(s + "'s age is " + i);
	}
	
	public void m1(String s, int i) {
		System.out.println("Inside method m1 with one string and one integer resp.  parameter");
		System.out.println(s + "'s age is greater than " + i);
	}
	
	public void m1(String s, String s1, String s2) { //"A ", "B ", "C "
		System.out.println("Inside method m1 with one string and one integer resp.  parameter");
		System.out.println(s2);
		System.out.println(s);
	}
	

}
