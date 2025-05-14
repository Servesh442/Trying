package practice;


public class Revrse_in_between {

	public static void main(String[]args) {
		
		String s= "my name is bond";
		String tar="name";
		String rev="";
		
		for(int i=tar.length()-1;i>=0;i--)
		{
			rev=rev+tar.charAt(i);
			
		}
		
		String result=s.replace(tar, rev);
		
		System.out.println(result);
	}
}
