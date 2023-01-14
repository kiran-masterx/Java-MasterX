package InterviewQuestions;

import java.util.Arrays;

public class FindSecondLargestArray {

	public static void main(String[] args) {
		int arr[] = { 1, 10, 10, 20, 30, 50, 100, 10, 80, 101, 555, 1000, 100 };
		// {1,10,10,10,20,30,50,80,100,101,555,1000}
		// {0,1,2,3,4/.... 
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 11]); // total length =10, .index starts from 0,
		//Printing sum of all the elements in an array
		int sum = 0; 
		int count = 0;
		for(int i : arr) {
			sum = sum + i; 
			count = count + 1; 
		}
		System.out.println("Sum is " + sum);
		System.out.println("Count is " + count);
	}

	public static void findNthLargestArray(int[] array, int n) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}

		}
		System.out.println(array[array.length - 3]);

	}

}
