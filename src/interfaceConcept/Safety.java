package interfaceConcept;

public interface Safety {
	
	//abstract method --> Mandatory to implement in child class
	public void sixAirbags();
	
	//non-abstract method --> Optional to implement in child class
	public static void fiveStarRating() {
		System.out.println("Safety-fiveStarRating");
	}
}
