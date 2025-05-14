package handelingPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		// this is for uploading file from the your pc 
		//driver.findElement(By.id("uploadfile")).sendKeys("/Users/servesh/Downloads/DSC_0857.JPG");
		
		
		
		//this for uploading file from folder of your project from eclipse. 
		//this did not work for some reason so i had to improvise.
	    //String projectpath = System.getProperty("user.dir");
	    
		//did not used the above method so i directly posted the path of the file.
	    driver.findElement(By.id("uploadfile")).sendKeys("/Users/servesh/eclipse-workspace/Selenium/src/screenshot2/kitty.jpg");
		
	}

}
