package revision;

import java.util.Scanner;

public class Reverse_String_Palindrome {

	public static void main(String[] args) {
		
// what ever value we have given piche se plategi and will be comapred to the value we have give 
//meaning like ser given will reversed as res and res will be compared to ser again if both matches
// it is palindrom if not it's not plaidnrom
		
		
		Scanner sc = new Scanner(System.in);
    	System.out.println("enter your String");
		
//reads the next token of input from the scanner sc and stores it as a string in the variable str
		String str= sc.next();
		String originalString= str;
		
		String rev= "";           
	
		int len=str.length();  
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i); 
			
		}
		if(originalString.equals(rev))
		{
			System.out.println(originalString+"Palindrome");
			
		}
		else 
		{
			System.out.println(originalString+"Not Palindrome");
		}
	}

}
