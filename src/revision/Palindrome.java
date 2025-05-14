package revision;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		
		// to take the input no and keept in the variable num
		int num = sc.nextInt();
		
		int originalNum= num;// Store the original number for comparison later
		
		int reverseNum=0;// Initialize a variable to store the reversed number
		
		while(num!=0)
		{
			// SCENARIO IF INPUT IS 12345
			//REMEMBER THIS LOGIC FOR REVERSING 
			
			int lastDigit = num % 10; //lastDigit = 12345 % 10 = 5 
			
   //12345 % 10 in Java calculates the remainder when 12345 is divided by 10. 
	//It results in 5, which is the last digit of 12345	
			
			reverseNum = reverseNum* 10 + lastDigit;//0 * 10 + 5 = 5
			
			num = num/10;//12345 / 10 = 1234
			
		}
		System.out.println(reverseNum);
		
		if(originalNum == reverseNum)
		{
			System.out.println("no is palindrome=  "+originalNum);
		}
		
		else 
		{
			System.out.println("no is not palindrome");
		}
		


	}

}
