import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uniqueelement {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement loginbtn =driver.findElement(By.xpath("//input[@id='login-button']"));
		if(loginbtn.isDisplayed()){
			System.out.println("page is displayed");
		
		}
			 
		else {
			System.out.println("page is not displayed ");
			
			
			
			

				
				
			}
		
		
		
		
		
	}

}
