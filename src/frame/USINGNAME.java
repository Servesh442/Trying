package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USINGNAME {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		//where id locator is not we use name locator .
		//this was done using NAME= classFrame .
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Description")).click();
        
      
        
        
		
	}

}
