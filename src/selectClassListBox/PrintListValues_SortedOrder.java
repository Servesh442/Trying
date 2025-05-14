package selectClassListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintListValues_SortedOrder {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/servesh/Desktop/new%20webpage.html");
		driver.manage().window().maximize();
		
		WebElement list = driver.findElement(By.id("\\'93mar\\'94"));
		
		Select s = new Select(list);
		
		List<WebElement> options = s.getOptions();
		
		int size = options.size();
		System.out.println(size);
		
		
		System.out.println("-----print the values in the list ----");
		
		ArrayList<String>list2= new ArrayList<String>();
        // This line starts a for-each loop that iterates over each 
		//WebElement object in the collection options.		
		for(WebElement option:options) {
			
			String text = option.getText();
			System.out.println(text);
	// This line adds the extracted text to the list2 ArrayList.		
			list2.add(text);
		}
		
		Collections.sort(list2);
		
		System.out.println("- sorted according to the assending order of alpahabatic order-");
//This line starts a for-each loop that iterates over each String element 	
	//in the list2 ArrayList after sorting.		
		for(String col:list2) {
			
			System.out.println(col);
			
		}
			
			
		}
		
		
	}


