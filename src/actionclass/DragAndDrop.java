package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		WebElement rome = driver.findElement(By.id("box6"));
		
		WebElement italy = driver.findElement(By.id("box106"));
		
		Actions actions =new Actions(driver);
		actions.dragAndDrop(rome, italy).build().perform();
		
		
	}

}
