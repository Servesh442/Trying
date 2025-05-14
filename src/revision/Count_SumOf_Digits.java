package revision;

public class Count_SumOf_Digits {

	public static void main(String[] args) {
		
		int num=12345;
		
		int sum = 0;

		
// this loop will run till num is greater that 0		
		  while(num!=0) {
			
//num%10 will give us 5 which is last digit which im adding to sum whose value is 0 already 			
			sum=sum+num%10; // 5+4+3+2+1 
			
//every time this this runs last digit gets deleted			
			num=num/10; // first 5 4 3 2 1 all these will be removed in this serial
			
			
		}
		
		System.out.println(sum);
	}

}
