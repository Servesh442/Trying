


// Verifying page using TITLE ,Current URl,

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingtitle {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		
		
		
	    String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		
	   if(actualTitle.contains(expectedTitle)) {
		System.out.println("page is verified");
				}
		     
		
		else
	    	 
		System.out.println("page is not verified");
		
		
		
		
		
		Thread.sleep(2000);
		driver.close();

	}

				
		 
		 }
	 
	
			
	  


