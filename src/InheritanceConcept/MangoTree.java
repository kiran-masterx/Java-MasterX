package InheritanceConcept;

public class MangoTree extends Tree{
	
	public void branches() {
		System.out.println("MangoTree-branches");
	}
	
	public void mango() {
		System.out.println("MangoTree-mango");
	}
	
	public static void main(String[] args) {
		
		//creating an object of child class
		//child class object prefer child class methods first
		//child class object can access child class methods as well as parent class methods
		MangoTree m = new MangoTree();
		m.branches();
		m.mango();
		m.leaf();

		//creating an object of parent class
		//only parent class methods are accessible
		Tree t = new Tree();
		t.branches();
		t.leaf();
		
		//Top Casting: child class object referred by parent class reference variable
		// only parent class methods are accessible
		Tree t1 = new MangoTree();
		t1.branches();
		t1.leaf();
//		t1.mango();
		
		//Down casting: parent class object is referred by child class reference variable
		//Not allowed
		
		//MangoTree m1 = new Tree();
		
		
	}
}
