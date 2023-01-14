package InheritanceConcept;

public class HapusTree extends MangoTree{
	
	public void apple() {
		System.out.println("AppleTree-apple");
	}
	
	public void branches() {
		System.out.println("AppleTree-branches");
	}
	
	public void branches11() {
		System.out.println("AppleTree-branches11");
	}
	
	
	public static void main(String[] args) {
		HapusTree a = new HapusTree();
		a.leaf();
		a.branches();
		a.mango();
		a.apple();
		a.branches11();
	}

}
