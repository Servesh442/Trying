package tooltiptextofthecheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickonbuttonorlink {

	public static void main(String[] args) throws InterruptedException {
		
		//TESTED diff ways of Clicking on a BUTTON
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).sendKeys(Keys.ENTER);
		
		//his method will work only and only if if the element has an attribute called type='submit'/
		 
		driver.findElement(By.xpath("//input[@id='login-button']")).submit();
		
		
		
		 
		Thread.sleep(3000);
		driver.quit();
		
	}

}
