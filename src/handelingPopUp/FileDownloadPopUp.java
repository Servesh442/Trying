package handelingPopUp;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FileDownloadPopUp {

	public static void main(String[] args) throws InterruptedException  {
		
		
		
		HashMap<String, Object> chromePrefs = new HashMap<String,Object>();
		// 0 for so that  will be  no pop up message asking for download.		
		chromePrefs.put("profile.default_content_settings.popups", 0);
		//where the fill be downloaded if we can our won path if want to change download file path.
		//user.dir for dowloading the file into our project but something is wrong here 
		String downloadFilepath= System.getProperty("user.dir");
		////where the fill be downloaded if we can our won path if want to change download file path.	
		chromePrefs.put("download.default_directory","downloadFilepath");
		ChromeOptions options = new ChromeOptions();
		//setting the prefrences thats it 
		options.setExperimentalOption("prefs", chromePrefs);
		
		
		WebDriver driver = new ChromeDriver(options); 
		driver.get("http://omayo.blogspot.com/p/page7.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'ZIP file')]")).click();
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
		
		
		
	
		
	}

}
