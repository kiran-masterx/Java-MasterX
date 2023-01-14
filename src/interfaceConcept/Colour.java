package interfaceConcept;

public interface Colour {
	
	public default void darkEdition() {
		System.out.println("Colour");
	}
	
	public void dualTone();

}
