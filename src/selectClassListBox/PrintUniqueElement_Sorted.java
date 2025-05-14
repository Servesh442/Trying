package selectClassListBox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintUniqueElement_Sorted {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/servesh/Desktop/new%20webpage.html");
		driver.manage().window().maximize();
		
		WebElement list = driver.findElement(By.id("\\'93mar\\'94"));
		
		Select s = new Select(list);
		
		List<WebElement> alloptions = s.getOptions();
		
		
		int size = alloptions.size();
		
		System.out.println(size);
		
		System.out.println("-----print the values in the list ----");
		
	     //TreeSet maintains its elements in sorted 
		//order defined either by the natural ordering 
		// HashSet does not guarantee any specific order of its elements.
		TreeSet<String> allelements= new TreeSet<String>();
		for(WebElement elelments:alloptions) {
			String txt = elelments.getText();
			System.out.println(txt);
	//so basically doing this  it will remove the duplicate element.		
			allelements.add(txt);
			
		}
		
		System.out.println(allelements);
		
		driver.quit();
	}

}
