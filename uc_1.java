
public class uc_1 {

	public static void main(String[] args) {
	
		System.out.println("Welcome to employee wage");
		
		int IS_FULL_TIME=1;
		
		double empcheck =Math.floor(Math.random()*10)%2;
		if (empcheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
