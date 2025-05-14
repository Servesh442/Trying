package javascriptexe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollUpandDowntospecificElementonWebpage {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement btnelement =driver.findElement(By.id("but2"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		// arguments[0].scrollIntoView() this is a JS code. 
		//arguments[0].scrollIntoView() means 0th index of argument btnelement.
		js.executeScript("arguments[0].scrollIntoView()", btnelement);
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
