
public class uc_5 {
/*
 * calculating wages for a month
 * assume 20 wok 
 */
public static final	int IS_PART_TIME = 1;	
public static final	int IS_FULL_TIME = 2;
public static final	int EMP_RATE_PER_HOUR = 20;
public static final	int NUM_OF_WORKING_DAYS = 20;
	

	public static void main(String[] args) {
	
	
	/*
	 * variables
	 */
	int emphrs = 0;
	int empWage =0;
	int totalempwage =0;
    /*
     * computation
	 */
	for (int day =0; day<NUM_OF_WORKING_DAYS; day++) {
	   int empcheck =(int) (Math.floor(Math.random()*10)%3) ;
	/*
	 * using switchcase
	 */
		switch (empcheck) {
		case IS_PART_TIME:
				    emphrs =4;
		break;
		
		case IS_FULL_TIME:
			        emphrs= 8;
		break;
		
		default:
			        emphrs= 0; 
		}
		    empWage = emphrs * EMP_RATE_PER_HOUR;
		    totalempwage += empWage;
		System.out.println("EmpWage :" + empWage );	
		}
	System.out.println("Total Emp Wage: " +  totalempwage);	
   }
}
