package basicJava;

public class ArrayConcept {

	public static void main(String[] args) {
		
//		int marks []= new int[4];
//		marks[0] = 10;
//		marks[1] = 20;
//		marks[2] = 30; 
//		marks[3] = 40;
//		System.out.println(marks.length);
//		System.out.println(marks[0]);
//		System.out.println(marks[3]);
//		
//		int marks1 [] = {10,20,30,40,50,60, 70, 80, 100};
//		
//		for(int m : marks1) {
//			System.out.println(m);
//		}
//		
//		//lower bound index = 0
//		// upper bound index = 6-1 = 5
//		//marks1.length = 6
//		
//		for(int i = 0; i <= marks1.length - 1; i++) { // 0, 1, 2, 3, 4, 5 
//			System.out.println(marks1[i]);
//		}
//		
//		System.out.println("Rev direction");
//		
//		for(int j = marks1.length - 1; j >= 0; j--) { //5, 4, 3, 2, 1, 0
//			System.out.println(marks1[j]);
//		}
//		
//		System.out.println("Partial");
//		for(int k = 2; k <= marks1.length-2; k++) {
//			System.out.println(marks1[k]);
//		}
//		
//		System.out.println("Enhanced for loop");
//		
//		for(int m : marks1) {
//			System.out.println(m);
//		}
//		System.out.println();
//		System.out.println(marks1[5]);
//		System.out.println(marks1.length);
//		
//		String [] day = {"Mon", "Tue", "Thu", "10.00"};
//		System.out.println(day[0]);
//		System.out.println(day[1]);

		String x [][] = new String[2][2];
		x[0][0] = "A";
		x[0][1] = "B";
		x[1][0] = "C";
		x[1][1] = "D";
		
		for(int i = 0; i<x.length; i++) {
			for(int j = 0; j<x[0].length; j++) {
				System.out.println(x[i][j]);  //0,0  
			}
		}

	}

}
