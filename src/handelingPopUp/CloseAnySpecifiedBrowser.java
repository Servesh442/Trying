package handelingPopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAnySpecifiedBrowser {

	public static void main(String[] args) {
		
		// this program took a lot of time did it by my own 
		WebDriver driver = new ChromeDriver();
		driver .get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();
		//Set the expected title of the browser window which you want to close
		 String expected_title = "New Window";
		 Set<String> allWindowHandles = driver.getWindowHandles();
		 
		 
		 for(String windowHandle:allWindowHandles) {
			//switch to each browser window
			 driver.switchTo().window(windowHandle);
			 String actualTitle = driver.getTitle();
			//Checks whether the actual title contains the specified expected title
			 if(actualTitle.contains(expected_title)) {
				 
				 driver.close();
				 
				 System.out.println("Specified Browser window with title is" +actualTitle+"is closed");
				 
			 }
			 
		 }
	}

}
