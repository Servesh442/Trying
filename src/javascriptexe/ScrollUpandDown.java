package javascriptexe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class  ScrollUpandDown  {

	public static void main(String[] args) throws InterruptedException { 
		 
	WebDriver driver= new ChromeDriver(); 
	driver.get("https://www.selenium.dev/downloads/"); 
	driver.manage().window().maximize(); 
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	//window.scrollBy(0, 5000) this is method of JS 
		js.executeScript("window.scrollBy(0, 5000)");
		Thread.sleep(3000);
		
	

	
	    js.executeScript("window.scrollBy(0, -1000)");
	    
	    Thread.sleep(3000);
	
	driver.quit();

	
	}	
	}

