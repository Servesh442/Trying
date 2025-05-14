package practice;
import java.util.HashMap;
import java.util.Map;

public class Duplicate_count_HashMap {
	
	
	

	public static void main(String[] args) {
		
          String s = "servesh";
          int len =s.length();
        
        // HashMap to store character counts
          HashMap<Character,Integer> map= new HashMap<Character,Integer>();
        
        // Traverse the string and count occurrences
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);	
            
   //map.getOrDefault(ch, 0): This part retrieves the value associated with the key ch from the map.
        //If the key ch already exists in the map, it returns the corresponding value.
        //If the key ch doesn't exist, it returns the default value, which is 0 in this case.
            map.put(ch, map.getOrDefault(ch, 0) + 1);//+ 1: This part adds 1 to the retrieved value.
        }       
        
        
    //  iterates through the map, and checks if any character has appeared more than once 
       //if(e.getValue()>1))     
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                //System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
                System.out.println("key  ::"  +e.getKey());
                System.out.println("value::"  +e.getValue());
            }
        }
    }
}