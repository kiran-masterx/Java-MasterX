package collectionConcept;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList <String> places = new LinkedList <String> ();
		
		places.add("Pune");
		places.add("Nagar");
		places.add("Aurangabad");
		
		System.out.println(places);
		
		//Commonly used methods of linkedList
		//1. addFirst() --> used to add the first element in a linkedList
		places.addFirst("Mumbai");
		
		places.addLast("Delhi");
		System.out.println(places);
		
		
		//retrieving first element
		System.out.println(places.get(0));
		System.out.println(places.getFirst());
		System.out.println(places.getLast());
		
		System.out.println(places.removeFirst());
		System.out.println(places.removeLast());
		System.out.println(places);
		
		for(int i =0; i<places.size(); i++) {
			System.out.println(places.get(i));
		}
		
		for(String i : places) {
			System.out.println(i);
		}
				


	}

}
