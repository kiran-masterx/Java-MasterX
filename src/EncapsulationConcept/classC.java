package EncapsulationConcept;

public class classC {
	
	public void mx (int i) {
		System.out.println(i);
	}
	public void mx (String s) {
		System.out.println(s);
	}
	public void mx(boolean b) {
		System.out.println(b);
	}
	public void mx(double d) {
		System.out.println(d);
	}
	public void mx(char c) {
		System.out.println(c);
	}

public static void main (String[]args) {
	classC m=new classC();
	m.mx("Aditya");
	m.mx('a');
	m.mx(false);
	m.mx(12.24);
 	m.mx(2);
 	m.mx(true);
 	m.mx(20);
 	
}
}