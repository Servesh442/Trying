package alignedtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Active_focused_element {

	public static void main(String[] args) throws InterruptedException {
		
		// could not understand
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.switchTo().activeElement().sendKeys("yolo");
		
		Thread.sleep(200);
		driver.quit();
		
		
	}

}
