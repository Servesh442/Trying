package revision;


public class Array_Loop_max {

	
	
	
	
	public static void main(String[] args) {
		
		int a[]= {34,56,34,78,23};
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			
	  //this for printing		
		  //if(a[i]<min)
			if(a[i]>max)
			{
			max=a[i];
			}
		}
		
		System.out.println(max);
		
	}

}
