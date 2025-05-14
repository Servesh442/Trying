package revision;

public class STATIC_NONsTATIC_BLOCK {
	
	

	
	// this is non static block this will be executed 2nd
	{
	
		System.out.println("this is non-static block");

	}
	
	static // this is static block this will be executed 1st
	{
		System.out.println("this is static block");
		
	}
	
	
	public STATIC_NONsTATIC_BLOCK()
	{
		//this will be executed 3rd 
		System.out.println("this is constructor");
	}
	
		public static void main(String[]args) {
			STATIC_NONsTATIC_BLOCK snb= new STATIC_NONsTATIC_BLOCK();
		}
		
	

}
