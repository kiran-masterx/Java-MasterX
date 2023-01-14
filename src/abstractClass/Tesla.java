package abstractClass;

public class Tesla extends Colour{

	public static void main(String[] args) {
		Tesla t = new Tesla();
		t.dualTone();
		t.darkEdition();
		t.electric();
	}

	public void dualTone() {
		System.out.println("Tesla-dualTone");	
	}
	
	public void electric() {
		System.out.println("Tesla-electric");
	}

	// Inheritance : extends keyword
	// Interface: implements
	// abstract class : extends
}
