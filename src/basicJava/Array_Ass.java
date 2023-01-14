package basicJava;

import java.util.Arrays;

public class Array_Ass {

	public static void main(String[] args){
		int[]arr= {14, 46, 47, 86, 92};
		
		Arrays.sort(arr);
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
//		System.out.println("static approach:" + arr[7]);
		int len = arr.length;
		System.out.println("length " + len); 
		//length is 10
		// total index is 9
		System.out.println("The third highest no is: " + arr[len-3]);  // 10-3 // 7 
		}
	}

