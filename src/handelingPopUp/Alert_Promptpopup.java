package handelingPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Promptpopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		
		//driver.findElement(By.xpath("//input[@type='button']")).click();
		
	    //In order to handle the alert pop up, we first have to switch to alert window
	    //by using this driver.switchTo().alert();
		//Switch to alert pop up
		 Alert alert = driver.switchTo().alert();
		
		
        System.out.println(alert.getText());
        
      //enter your name in the text box present on the alert pop up
        alert.sendKeys("servesh");
        Thread.sleep(3000);
      //click on OK button
        alert.accept();
        Thread.sleep(2000);
      //print the text present on the second alert pop up
        System.out.println(alert.getText());
      //click on Cancel button
        alert.dismiss();
        
        
		
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
	}

}
