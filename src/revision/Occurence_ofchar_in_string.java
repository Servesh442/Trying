package revision;


public class Occurence_ofchar_in_string {

	public static void main(String[] args) {
		
		
		String s=  "all is well";
		
		int count =0;
		int len=s.length();
		
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i) == 'l' )
			{
				count++;
			}
		
		
		}
		
		
		System.out.println(count);
	}
	
	
}
		
		
	


