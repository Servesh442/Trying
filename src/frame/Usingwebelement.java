package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingwebelement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://blogpendingtasks.blogspot.com/p/switchtoframeusingwebelement.html");
		driver.manage().window().maximize();
		
		// could not complete it try again 
		WebElement frameelm=driver.findElement(By.xpath("//iframe[@title='arunmotoori']"));
		
		
		driver.switchTo().frame("frameelm");
		
		driver.findElement(By.xpath("//a[@class='home-link']")).click();
		
		
		
		
		
		
		
        
	}

}
