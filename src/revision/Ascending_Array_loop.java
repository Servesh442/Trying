package revision;

import java.util.Arrays;

public class Ascending_Array_loop {

	public static void main(String[] args) {
		
		
		/*  Outer loop: Controls the number of passes.
Inner loop: Compares adjacent elements.
Swap logic: Swaps elements if needed. */
		
		
		/* Why int i = 0;
		 * index (0) because you need to compare the first element with the second, 
		*  then the second with the third, and so on    */
		
		int a[]= {1,9,6,2,4};

// The array has 5 elements (a.length = 5), 
// but we only need 4 passes to sort the array, which is why the loop runs a.length - 1 times.		
		for(int i=0; i<a.length-1;i++)
		{
//This loop performs the actual comparison 
	// swapping of adjacent elements within the unsorted portion of the array.			
			for(int j=0;j<a.length-i-1;j++) 
			{
				
// If the current element (a[j]) is greater than the next one (a[j+1]), 
	//	they are swapped to arrange them in ascending order.				
			if(a[j]>a[j+1])
			{
			int temp= a[j]; // Save the current element in a temp variable
			a[j]=a[j+1];  //The next element (a[j+1]) is moved to the current position (a[j]).
	//The original value of a[j] (stored in temp) is moved to the next position (a[j+1]).			
			a[j+1]= temp;
			
							
			}
						
		}
		}
		System.out.println(Arrays.toString(a));
				
		
}
		

}
			
		
	


