package basicJava;

public class SwitchCaseStatement {
	
	public static void main(String[] args){
        int day = 8;  ///1-mon, 2-tue, 3-wed, 4- thu, 5-fri, 6- sat, 7-sun
        String dayName;
  
        switch (day) {
  
        case 1:
        	dayName = "Monday";
            break;
  
        case 2:
        	dayName = "Tuesday";
            break;
  
        case 3:
        	dayName = "Wednesday";
            break;

        case 4:
        	dayName = "Thursday";
            break;

        case 5:
        	dayName = "Friday";
            break;

        case 6:
        	dayName = "Saturday";
            break;

        case 7:
        	dayName = "Sunday";
            break;
            
        case 8:
        	dayName = "Holiday";
        	break;
 
        default:
        	dayName = "Invalid day";
        }
        System.out.println(dayName);
    }

}
