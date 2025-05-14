package selectClassListBox;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChecklisthasDUPLICATEvalues_HashSet {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/servesh/Desktop/new%20webpage.html");
		driver.manage().window().maximize();
		
		 WebElement list = driver.findElement(By.id("\\'93mar\\'94"));
		
		Select s =new Select(list);
		
		List<WebElement> alloptions = s.getOptions();
		int size = alloptions.size();
		System.out.println("Number of elements in the list is :" +size);
		
		HashSet<String> allElementText= new HashSet<String>();
      //Putting it all together, the for loop iterates through a sequence of numbers 
		//starting from 0 up to size - 1, incrementing i by 1 each time. 		
		 
	 for (int i = 0; i < size; i++) {
			 String txt = alloptions.get(i).getText();
			 System.out.println(txt);
			 
			 allElementText.add(txt);
			 
			
			
	 }
	 int size2 = allElementText.size();
	 System.out.println("Number of elements in the hashset is :" +size2);
	 if(size==size2) {
		 System.out.println("list box has no duplicates");
		 
	 }
	 else {

		 System.out.println("list box has duplicates"); 
		 
	 }
	 System.out.println(allElementText);
		 
		
		
      Thread.sleep(2000);
      
          driver.quit();

	 }

	}

