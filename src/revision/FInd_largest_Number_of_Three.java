package revision;

import java.util.Scanner;

public class FInd_largest_Number_of_Three {

	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter 1st number");
		int a=sc.nextInt();
		
		System.out.println("enter 2nd number");
		int b=sc.nextInt();
		
		System.out.println("enter 3rd number");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			
			System.out.println("ais the biggest no"+a);
			
		}

		else if (b>a && b>c){
			System.out.println(" b is the bigegest number"+b);
		}
		
		else {
			System.out.println("c is the biggest "+c);
		}
	}

	
	
	
}



