package alignedtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//perfect example for aligned 


    public class Aligned {

	public static void main(String[] args) {
		
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement mail =driver.findElement(By.id("email"));
	int unameYcordinate= mail.getLocation().getY();
	System.out.println("unameYcordinate");
	
	
	WebElement pwd=driver.findElement(By.name("pass"));
	int passYcordinate=pwd.getLocation().getY();
	System.out.println("passYcordinate");
	
	if(unameYcordinate==passYcordinate) {
		System.out.println("Both username and password fields are displayed in the same row");
	}
	else {
		System.out.println("username and password fields are NOT aligned in the same row");
	}

		

}
}