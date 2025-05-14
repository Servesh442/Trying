package handelingPopUp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUpHandles {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		//using getWindowHandles(), get a set of window handle IDs
		Set<String> allwindowHandles = driver.getWindowHandles();
		
		//using size(), get the count of total number of browser windows
		int size = allwindowHandles.size();
		
		System.out.println("no of browser windows opened on the pc is "+size);
		
		for(String windowHandle:allwindowHandles) {
			
			//switch to each browser window
			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			
			//print the window handle id of each browser window
			System.out.println("window handle id of page"+title+"is"+windowHandle);
			
			
		}
		
		
		
	}

}
