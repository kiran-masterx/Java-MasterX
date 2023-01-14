package basicJava;

public class ConstructorConcept {
	
	String ClassName;
	String TotalStudent; 
	int marks; 
	
	public static void main(String[] args) {
		ConstructorConcept a = new ConstructorConcept();
//		a = null;
		ConstructorConcept a1 = new ConstructorConcept("masterX", "15", 100);
		System.out.println(a1.ClassName);
		System.out.println(a1.TotalStudent);
		ConstructorConcept a2 = new ConstructorConcept("100", "test");
	}
	
	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(String a, String b, int c) { // "masterX", "15", 100
		ClassName = b;
		TotalStudent = a;
		marks = c;
		System.out.println("3 Parameter Constructor");
	}
	
	public ConstructorConcept(String a, String b) {
		System.out.println("2 Parameter Constructor");
	}
	
	public ConstructorConcept(String a) {
		System.out.println("1 Parameter Constructor");
	}
	
}
