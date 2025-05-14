package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextclickorRIGHTCLICK {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement unamebox = driver.findElement(By.name("search"));
		
		// Actions is predefined class of selenium
		//Actions(driver)we have pass the driver reference to Actions constructor.
		// we cant leave it like that ::new Actions(); we have to pass the refrence of wedriver.
           Actions actions = new Actions(driver);
	
		  //contextClick method is for rigth click.we must have to use .perform 
		  actions.contextClick(unamebox).perform();
		  
		
		
		

	}

}
