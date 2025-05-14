import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicexpath {
	

	public static void main(String[] args) throws InterruptedException {
		//i have changed the link url
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(" standard_user");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys(" secret_sauce ");
		//driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		//***************************************************************************
		
		
		//using text() function i have done this.
  driver.findElement(By.xpath("//a[text()='Forgot login info?']")).click();
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		//driver.quit();
		
		
		
		
	}

}
