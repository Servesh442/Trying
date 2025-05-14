import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath
{
	    public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

			
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
				
		//Absolute xpath code		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-shirts");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		
		
			Thread.sleep(5000);
			driver.quit();
			
				
				
			}
}
