package selectClassListBox;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
      //*******************//Revise this concept bit tricky//*******************************
public class PrinttheDUPLICATEItem_intheList_HashSet {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/servesh/Desktop/new%20webpage.html");
		driver.manage().window().maximize();
		
		WebElement list = driver.findElement(By.id("\\'93mar\\'94"));
		
		Select s =new Select(list);
		
		List<WebElement> alloptions = s.getOptions();
		int size = alloptions.size();
		System.out.println("Number of elements in the list is :" +size);
		
		HashSet<String> allElementText= new HashSet<String>();
		
		 for (int i = 0; i < size; i++) {
			 String txt = alloptions.get(i).getText();
		 
			 
		//  != This is the logical NOT operator in Java. 
//this line of coede mainly responsible for getting duplicate element
//f (!allElementText.add(txt)) checks whether the text txt is not already present in the allElementText list. 
 //If it's not already there (meaning it wasn't successfully added), 
 //the condition becomes true and the code inside the if statement will execute.
//Otherwise, if the text is already present in the list, the condition is false 
	//and the code inside the if statement won't execute.			 
			  if(!allElementText.add(txt)) {
			  
			  
				  System.out.println(txt+"::is the duplicate item in the list box");
				  
			  
			  
			  
				System.out.println(allElementText.size());
				
			  System.out.println(allElementText);
			driver.quit();
			
		 }
	}
}
}				  
		
		 
		 
			  
	

