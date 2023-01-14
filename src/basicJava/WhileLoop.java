package basicJava;

public class WhileLoop {

	public static void main(String[] args) {
//		while (condition){    
//			//code to be executed   
//			Increment / decrement statement  
//			} 
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		//this below code is of while loop
		int i=10;  						//10	//10
	
		while(i >= 50){  				//true	true
		    System.out.println(i);  	//10	9		8 7 6 5 4 3 2 1 0
		    i--;  						//9		8
		} 
//		System.out.println("existed from while loop");
		
		int j = 5; 
		do {
			System.out.println(j);  // 5	4	 3		2		1		0	
			j--;					// 4	3	 2		1		0		-1
		}while(j>=10);				// true true true	true	true	false
	
	
//		System.out.println("kkkkk");
//		int k = 5; 
//		do { 
//			System.out.println(k);  // 5	
//			k--;					// 4
//		}while(k>=10);				// false
		
		
		
	}
		


}
