package revision;

import java.util.Scanner;

public class Test {

	
	
	public static void main (String[]args) {
		
	
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		int originalnum= num;
		int reverse=0;
		
		while(num!=0) {
			
			int lastdigit= num %10;
			reverse=reverse+num*10+lastdigit;
			num=num/10;
			
			
		}
		
		if(originalnum==reverse) {
			System.out.println("no is palindrome");
		}
		
		else
		{
			System.out.print("no is not plindrome");
		}
	}
}


