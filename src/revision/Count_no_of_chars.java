package revision;

public class Count_no_of_chars {

	public static void main(String[] args) {
		
		
		String s=  "hi my";
	//String ss =s.replace(" ", "");
		int count=0;	
		
		    
		for(int i=0;i<s.length();i++)
		{
//the space character ' ' instead of the empty string "".
			if(s.charAt(i)!=' ') {
				count++;
				
			}
				
		}
			
			System.out.println(count);
		
		
	}
	

}
