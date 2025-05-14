package revision;

public class Count_number_ofdigits {

	public static void main(String[] args) {
		
		
/**		
The loop removes one digit at a time by dividing num by 10.
count tracks how many digits were removed.
When num becomes 0, count equals the number of digits in the original num.
	**/	
		
		int num =123457;
		int count=0;

// loop will continue as long as num is not zero.
		while(num!=0)
		{
			
//Each time through the loop, divide num by 10. This removes the last digit of num.
//Increase count by 1 to keep track of the number of digits removed.			
			num=num/10;
			count++;
		}
		
	
		System.out.println(count);
	}

}
