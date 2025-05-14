package revision;

public class Max_array_of_2 {

	public static void main(String[] args) {
		
		/*  it checks each element in a to see if it's bigger than max 
		 * and updates max if it finds a larger one. */
		
		
		int a[] = {1, 9, 6, 2, 4};
		int b[] = {65, 8, 12, 22, 44};
		
		int max = a[0];
		
		for(int i=0;i<a.length;i++) // Loop through all elements of array 'a'
		{
			if(a[i]>max)  //If the current element is greater than 'max'
			{
				max=a[i];
			}
		}
		
		for(int j=0;j<b.length;j++)
			
		{
			if(b[j]>max)
			{
				max=b[j];
			}
		}
		
		System.out.println("max "+ max);

				
		
}
		

}
			
		
	


