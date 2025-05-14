package revision;

public class Reverse_String_STringBuilder {

	public static void main(String[] args) {
		
		
		String str="servesh";
		
		//StringBuilder reversedString= new StringBuilder(str);
		//reversedString.reverse();
		StringBuilder rev= new StringBuilder(str);
		StringBuilder rev2=rev.reverse();
		
		System.out.println("original.."+str);
		System.out.println("reversed.. .."+rev2);
		
	}

}
