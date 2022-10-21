
public class uc_3 { 
	/*
	 * part time emplooyee & wage
	 */

	public static void main(String[] args) {

		/*
		 * constants
		 */
		
	int IS_PART_TIME = 1;	
	int IS_FULL_TIME = 2;
	int EMP_RATE_PER_HOUR=20;
	
	/*
	 * variables
	 */
	int emphrs = 0;
	int empWage =0;
	 
    /*
     * computation
	 */
		double empcheck =Math.floor(Math.random()*10)%3 ;
		if (empcheck == IS_PART_TIME)
				    emphrs =4;
		else if (empcheck == IS_FULL_TIME)
			        emphrs= 8;
		else
			        emphrs= 0;
		    empWage = emphrs * EMP_RATE_PER_HOUR;
		System.out.println("EmpWage :" + empWage );	
	
	}

}
