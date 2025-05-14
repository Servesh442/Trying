package practice;


public class Count_individual_char {

	public static void main(String[]args) {
		
		
		String s ="servesh";
		char c='v';
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='v')
			{
				count++;
			}
			
			
		}	
		System.out.println(count);	
}
		
}
	
	
