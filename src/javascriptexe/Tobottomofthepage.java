package javascriptexe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tobottomofthepage {

	public static void main(String[] args) {

		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,5000)");
		
		
		
	}

}
