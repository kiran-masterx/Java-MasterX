package EncapsulationConcept;

public class classB {
	
	public static void main(String[] args) {
		classA a = new classA();
		
		a.getUsername();
		a.getPassword();
		
		System.out.println(a.getUsername());
		System.out.println(a.getPassword());
		
		a.setUsername("user@123");
//		a.setPassword(12345678);
		a.setPassword(100000);
		
		System.out.println(a.getUsername());
		System.out.println(a.getPassword());
	}

}
