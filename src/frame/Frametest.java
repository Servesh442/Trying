package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frametest {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//USING ID OF FRAME.
		
		//"mce_0_ifr" this is the id of frame where i have send keys iwll do it 
		//by directly using id of frame we can get in the frame and do our business
		driver.switchTo().frame("mce_0_ifr");
        
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("i will do it ");
		
		//USING NAME .
		
		
        
        Thread.sleep(3000);
        driver.quit();
        
	}

}
