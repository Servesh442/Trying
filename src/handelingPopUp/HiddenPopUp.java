package handelingPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		//could not do it
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.busonlineticket.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='custom-nav-lnk active']")).click();
		driver.findElement(By.xpath("//input[@id='txtDepartDate']")).click();
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		//driver.findElement(By.xpath("//body[@class='home page-template page-template-new-tmp-index page-template-new-tmp-index-php page page-id-64940']/div[@id='ui-datepicker-div']/table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[2]/a[1]")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
	

}
}