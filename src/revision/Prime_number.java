package revision;

public class Prime_number {

	public static void main(String[] args) {

		
		
		
		int num=3;
		
		int count=0;
		
//This checks if num is greater than 1. 
//Since num is 3, this condition is true,so the code inside the if block will run		
		if(num>1) 
		{
			
			for(int i=1;i<=num;i++) {
	//If num % i == 0, it means i is a divisor of num	
	//If this condition is true, count is incremented by 1.			
				if(num%i ==0) {
					
					count++;
				}
			}
			
//count == 2 checks if the number has exactly 2 divisors
//A prime number is defined as a number that has exactly two divisors: 1 and itself.
			
			if(count==2)
			{
				System.out.println("no is prime ");
			}
			else
			{
				System.out.println("no is not prime ");
			}
		}
		
		
	}

}
