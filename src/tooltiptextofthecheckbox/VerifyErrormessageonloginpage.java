package tooltiptextofthecheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyErrormessageonloginpage {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		WebElement errormsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
		
		// get the text of the error message
		String textoferrmsg= errormsg.getText();
		
		System.out.println("error text message is "+textoferrmsg);
		
		//get the value of color and store in a variable ***
		String coloroferrmsg=errormsg.getCssValue("color");
		System.out.println("color of error message is"+coloroferrmsg);
		
		//convert the color from string type to hexa form ***
		
		String hexcolor= Color.fromString(coloroferrmsg).asHex();
		
		System.out.println("hexadecimal format : "+hexcolor);
		
		if(hexcolor.equals("#ce0100")) {
			System.out.println("Error message is in red color");
			
		}else {
				System.out.println("Error message is not in red color");
		}
		
		
		String fontsize = errormsg.getCssValue("font-size");
		
		String fontwidth= errormsg.getCssValue("Ffont-width");
		System.out.println("size of font is:"+fontsize);
		System.out.println("swidth of font is:"+fontwidth);
		
		
		
	
	
	
		
		
	}	
	}


