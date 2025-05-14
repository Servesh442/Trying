package selectClassListBox;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashMapExampleOccurunceOfPoori {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/servesh/Desktop/new%20webpage.html");
		driver.manage().window().maximize();
		
WebElement list = driver.findElement(By.id("\\'93mar\\'94"));
		
		Select s =new Select(list);
		
		List<WebElement> alloptions = s.getOptions();
		
//****************************************************************************************		
		//**********HashSet is used when you need to store a collection of************* 
        //**********unique elements without any associated keys*****************	
//****************************************************************************************				
		
        //*******HashMap is used when you need to store key-value pairs******* 
		//********and require fast lookup, insertion, and deletion based on keys,*********
		
       //a Hash  //Map named hashMapObj which maps strings to integers. 
	//It's used to store the text content (string) as keys and their occurrences (integer) as values.		
		HashMap<String,Integer> hashMapObj = new HashMap<String,Integer>();
		
		for(WebElement options:alloptions) {
			
			String txt = options.getText();
		//it checks whether the HashMap named hashMapObj already contains the text txt as a key.	
			if(hashMapObj.containsKey(txt)) {
				
		//If the text txt is already a key in the HashMap, 
		// it retrieves the current value associated with that key and increments it by one.		
				 Integer value = hashMapObj.get(txt);
				 value++;
	//Then it updates the HashMap by putting the updated value back into the HashMap with the same key.		 
				hashMapObj.put(txt, value);}
				else {
					hashMapObj.put(txt, 1);
			}
		}
		
	//This line retrieves all the keys (text content) from the hashMapObj HashMap 
		//and stores them in a Set called allkeys.	
		Set<String> allkeys = hashMapObj.keySet();
		//This is a for-each loop that iterates through each key in the allkeys Set.
		for (String key : allkeys) {
	//For each key it retrieves the corresponding value (occurrence count) from the hashMapObj HashMap.		
			Integer value1 = hashMapObj.get(key);
	//It prints out the key along with its corresponding value  how many time that has occurred.		
			System.out.println(key+"::>>"+value1);
			
			if(value1>1) {
				System.out.println("Occurance of " + key + " is :" + value1);
				
				driver.quit();
				
			}
			
		}
	}

}
