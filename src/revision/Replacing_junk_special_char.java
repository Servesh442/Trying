package revision;

public class Replacing_junk_special_char {

	public static void main(String[] args) {
		
		
		//inbuilt method 
		
		String s= "@$#&^%$(*)*&^&%%$ serveshkumar 123456*&^%`";
		String ss=s.replaceAll("[^a-zA-Z0-9]", "");
		
		//String news=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(ss);
	}

}
