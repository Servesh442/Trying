package practice;


public class One_100 {
	
	
	public static void printnum(int num)
	{
//chechking if num =or< than 100 if condition is true then numwill be printed 
		if(num<=100) 
		{
		//if above condition is true print the value of  num 
			System.out.println(num);
			
	//recursive call to the same method, incrementing num by 1	
			printnum(num+1);
		}
	}

	public static void main(String[] args) {
		
  //isse int num me 1 chala jayega and increment hota rahega till 100
		int i=1;//starting point for the recursion)
		printnum(i);// calling the printnum method with i as the starting value

			
	}
}
		
	


