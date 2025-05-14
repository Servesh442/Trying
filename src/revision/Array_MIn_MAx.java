package revision;

import java.util.Arrays;
import java.util.Collections;


public class Array_MIn_MAx {

	
	public static void main(String[] args) {
		  Array_MIn_MAx Array_MIn_MAx = new Array_MIn_MAx();
		
		int a[]= {12,1,45,7};
 //Arrays.sort is the inbuilt method for sorting 
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		
		
		System.out.println("min"+a[1]);
		System.out.println("max"+a[a.length-1]);
		System.out.println("Max"+a[a.length-1]);
		System.out.println("min"+a[0]);
		
		
	}
		
	// Constructor should be outside of any method

		      public Array_MIn_MAx()
		   {
			
			
//Descending Order: Arrays.sort(a, Collections.reverseOrder()); 
//works only for Integer[] because Collections.reverseOrder() 
//provides a comparator for object types, reversing the natural order.
			
			Integer a[]= {1,50,80,100};
			//Arrays.sort(a);	
			//System.out.println(Arrays.toString(a));
			
			Arrays.sort(a,Collections.reverseOrder());
			
			System.out.println("2nd number is "+a[3]);
			System.out.println(Arrays.toString(a));
			
			
			
		}

		
		
}
