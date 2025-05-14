package revision;

public class RevErse_String_Simple {

	public static void main(String[] args) {
		
		
		
		/*
Iteration 1: i = 6, s.charAt(6) = 'h' → reverse = " h"
Iteration 2: i = 5, s.charAt(5) = 's' → reverse = " hs"
Iteration 3: i = 4, s.charAt(4) = 'e' → reverse = " hse"
Iteration 4: i = 3, s.charAt(3) = 'v' → reverse = " hsev"
Iteration 5: i = 2, s.charAt(2) = 'r' → reverse = " hsevr"
Iteration 6: i = 1, s.charAt(1) = 'e' → reverse = " hsevre"
Iteration 7: i = 0, s.charAt(0) = 's' → reverse = " hsevres"
After the loop finishes, the string reverse will contain " hsevres",
 which is the reversed version of "servesh".
		*/
		
		
		String str= "Nirmala";
		String reverse="";
		int length=str.length();
		
		//length-1= this will start from last character piche se
//i>=0=The loop stops when i becomes less than 0, meaning you've processed all the characters.
	for(int i=length-1; i>=0;i--)//i>=0 =beause index starts at 0 /i-- beacuse piche se decreement 
		{
       //charAt(i) gives the character at passed index if we give 1 e will be given 
             reverse=reverse+str.charAt(i);	
			
		}
		
		System.out.println(reverse);
		
	}

}

