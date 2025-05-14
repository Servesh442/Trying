package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementMouse {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement movehere = driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Laptops & Notebooks')]"));
		
		
		Actions actions= new Actions(driver);
		
		actions.moveToElement(movehere).build().perform();
		
		
		
		
		
		
		
	}

}
