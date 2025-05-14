package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.istqb.in");
		
		driver.manage().window().maximize();
		
		WebElement foundationelm = driver.findElement(By.xpath("//span[contains(@class,'sp-menu-heading')][contains(text(),'FOUNDATION')]"));
		
		//i did this by my own.
		
		Actions actions= new Actions(driver);
		actions.moveToElement(foundationelm).build().perform();
		Thread.sleep(3000);
		
		WebElement enrollelm = driver.findElement(By.xpath("//li[@class='item-228 menu_item item-header']//a[contains(text(),'ENROLLMENT')]"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(enrollelm).click().build().perform();
		Thread.sleep(3000);
		
		WebElement coporate = driver.findElement(By.id("field9"));
		Actions actions2=new Actions(driver);
		actions2.moveToElement(coporate).click().build().perform();
		Thread.sleep(3000);
		
		WebElement submitbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		Actions actions3=new Actions(driver);
		actions3.moveToElement(submitbtn).click().build().perform();
		Thread.sleep(5000);
		
		
		
		
		driver.quit();
		
		
	}

}
