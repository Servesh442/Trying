package tooltiptextofthecheckbox;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicktets {
	
	
	
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		// here searchbox is used as a variable to store driver.find elemet.
		WebElement searchbox= driver.findElement( By.id("search_query_top"));
		
		searchbox.sendKeys("Printed Dress");
		driver.findElement(By.name("search_query")).click();
		
		
//		driver.findElement(By.linkText("Printed Dress")).click();
//		driver.findElement(By.partialLinkText("Printed")).click();
//	
		//CLASS NAME LOCATOR 
//		int imagecounts =driver.findElements(By.className("homeslider-description")).size();
//		System.out.println(imagecounts);
//		
//		
//		int numbersoflink=driver.findElements(By.tagName("a")).size();
//		System.out.println(numbersoflink);
		
		Thread.sleep(5000);
		//driver.quit();
		
		
		
		
		
	}

}



