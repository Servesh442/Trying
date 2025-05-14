package selectClassListBox;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintUniqueElementinthelistbox {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/servesh/Desktop/new%20webpage.html");
		driver.manage().window().maximize();
		
		WebElement list = driver.findElement(By.id("\\'93mar\\'94"));
		
		Select s= new Select(list);
		List<WebElement> option = s.getOptions();
		int size = option.size();
		System.out.println(size);
		
		System.out.println("-----print the values in the list ----");
   //allElements: This is the name of the HashSet variable. 		
		HashSet<String>allElemnts=new HashSet<String>();
		for(WebElement options:option) {
			String txt = options.getText();
			System.out.println(txt);
	//eliminate any duplicate text values. HashSet does not allow duplicate elements		
			allElemnts.add(txt);
			
		}
		
		System.out.println(allElemnts);
		
		
		
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
