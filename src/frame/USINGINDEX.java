package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USINGINDEX {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		//index will be 0 when there is only 1 frame on the page.
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("servesh");
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
