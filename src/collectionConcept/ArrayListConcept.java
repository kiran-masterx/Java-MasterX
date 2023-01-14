package collectionConcept;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//Creating a string arraylist for storing the strings
		ArrayList <String> names = new ArrayList <String> (); 
		names.add("Ram");  //0
		names.add("Shyam"); //1
		names.add("Ram Rajput"); //2
		names.add("Ram Rajput1"); //3
		names.add("Ram Rajput2"); //4
		names.add("Ram Rajput3"); // 5
		System.out.println(names); 
		
		//getting an element for specific index
		System.out.println(names.get(2));
		//If calling the element unavailable element then it will throw -> IndexOutOfBoundsException
		
		//Setting an element
		names.set(0, "Ram123");
		System.out.println("Updated element name -> " + names.get(2));
		
		//removing an element from arrayList
		System.out.println("=============================");
		names.remove(2);
		System.out.println("2rd element: " + names.get(2));
		System.out.println(names);
		
		//Size of an arraylist
		System.out.println(names.size());
		
		//Iterating throw arraylist
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i) + " city");
		}
		
		System.out.println("for each will start from here");
		//for each loop
		for(String i : names) {
			System.out.println(i);
		}
		
		//creating a integer arraylist for storing integers/numbers
		ArrayList <Integer> marks = new ArrayList <Integer> (); 
		marks.add(10);
	}

}
