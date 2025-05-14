package revision;

public class RevrseNumber {

	public static void main(String[] args) {
		
		int a = 123456;
		
		int rev =0;
	// iteration will happen for 6 time because 6 numbers 	
		while (a!=0)
		{
	//int number = a % 10; → number = 123456 % 10 = 6		
			int number=a%10;//extracts the last digit of a
	
	//rev = rev * 10 + number; → rev = 0 * 10 + 6 = 6
			rev=rev*10+number;//last digit 6 is added to rev.
	
	//a = a / 10; → a = 123456 / 10 = 12345
			a=a/10;//This removes the last digit from a
			
			//Second iteration:a = 12345
			//Second iteration:a = 1234
			//third iteration:a = 123
			// will go for 6 times
			
			
			
		}
		
		System.out.println(rev);
		

	}

}
