package alignedtest;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveValuefromText_usingClearMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.id("user-name")).sendKeys("dota");
		
		Thread.sleep(2000);
		
		String valueofatr =driver.findElement(By.id("user-name")).getAttribute("valueofatr");
		//.clear() method is sued to clear any text.
		System.out.println("value present indside is "+valueofatr );		
		driver.findElement(By.id("user-name")).clear();
		
    	Thread.sleep(2000);
		
		driver.findElement(By.id("user-name")).sendKeys("dotaagain");
		
		Thread.sleep(2000);
		 // this line will actually delete the value if there is no space in the text entered
		//for some reason this one is not working i dont know why 
		//driver.findElement(By.id("user-name")).sendKeys(Keys.COMMAND+"a"+Keys.DELETE);
		
    // if there is a space between two words in the username field, we have to use the below lines of code
		//use this its works perfectly 
		driver.findElement(By.id("user-name")).sendKeys(Keys.COMMAND+"a");
		driver.findElement(By.id("user-name")).sendKeys(Keys.DELETE);
		
		
		Thread.sleep(3000);
		driver.quit();
		 
		
		
		
		
	}
	}


