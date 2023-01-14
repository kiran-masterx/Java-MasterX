package basicJava;

public class StaticAndNonStatic {
	static String name = "ram";
	static String lastName = "Saxena";
	int marks = 89;
	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(StaticAndNonStatic.lastName);
		StaticAndNonStatic obj = new StaticAndNonStatic();
		System.out.println(obj.marks);
		m1();
		StaticAndNonStatic.m1();
		obj.m2();
		obj.m1();}
	public static void m1() {
		System.out.println("Inside static method m1");}
	public void m2() {
		System.out.println("Inside non-static method m2");}}
