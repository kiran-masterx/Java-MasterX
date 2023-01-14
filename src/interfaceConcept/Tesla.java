package interfaceConcept;

public class Tesla implements Safety, Colour{

	public static void main(String[] args) {
		Tesla t = new Tesla();
		t.sixAirbags();
		t.electric();
		
		Safety.fiveStarRating();
		
		t.darkEdition();
		t.dualTone();
		
		String [] arr = new String[50];
	}


	
	//Tesla's own method
	public void electric() {
		System.out.println("tesla - electric");
	}

	public void darkEdition() {
		System.out.println("Tesla-darkEdition");
	}

	public void dualTone() {
		System.out.println("Tesla-dualTone");
	}



	@Override
	public void sixAirbags() {
		// TODO Auto-generated method stub
		
	}
}
