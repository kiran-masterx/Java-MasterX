package InterviewQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//Armstrong Number: The sum of cubes of each digits is equal to the number itself
		//153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		System.out.println(isArmstrong(151));
		System.out.println(isArmstrong(153));
	}
	
	public static boolean isArmstrong(int num) {
		int reminder;
		int cube = 0;
		int temporary;
		temporary = num; 
		
		while(num>0) {
			reminder = num % 10; //153%10 = 3 = 5 = 0
			num = num / 10; //153/10 = 15.3 = 1.53 =0.153
			cube = cube + reminder*reminder*reminder; //cube = 0 + 3 * 3 * 3 = 27 = 27 + 125 =152 +1 = 153 
		}
		
		if(temporary==cube) {
			System.out.println(temporary + " It is AN");
			return true;
		}else {
			System.out.println(temporary + " It is not AN");
			return false;
		}
		
	}

}
