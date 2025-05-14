import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingcurrenturl1 {

	public static void main(String[] args) {
		 
			 {
			    WebDriver driver= new ChromeDriver();
				driver.get("https://www.saucedemo.com/v1/");
				driver.manage().window().maximize();
				
				String expectedUrl="https://www.saucedemo.com/v1/";
				String actualUrl=driver.getCurrentUrl();
				
				if(actualUrl.contains(expectedUrl)) {
					System.out.println("page is verified");
					
				}
				else
				{
					System.out.println("page is not verified");
				}
			 
			 }
		 }
		
				
		  
	}


