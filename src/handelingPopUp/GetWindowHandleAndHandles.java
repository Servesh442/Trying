package handelingPopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleAndHandles {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		String firstwindowhandle=driver.getWindowHandle();
		
		System.out.println(firstwindowhandle);
		
		
		//driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();
		
		//Set<String> multiwindow = driver.getWindowHandles();
		
		//Iterator<String> itr = multiwindow.iterator();
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
