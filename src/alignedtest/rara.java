package alignedtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rara {

	public static void main(String[] args) {
		
	// Write a program to validate Username and Password fields on testsite login page are aligned
		 //or not ?
				 	
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement uname=driver.findElement(By.id("user-name"));
		//getx() and gety() only return in integer type thats why int locun is used to keepthe value of uname and it follows below
	
		
		int locun=uname.getLocation().getX();
		
		int unheight=uname.getSize().getHeight();
		
		int unwidth=uname.getSize().getWidth();
		
		WebElement pwd=driver.findElement(By.name("password"));
		
		int locpwd=pwd.getLocation().getX();
		
		int heightpwd=pwd.getSize().getHeight();
		
		int weidthpwd=pwd.getSize().getWidth();
		
		if(locun==locpwd && unheight==heightpwd && unwidth==weidthpwd) {
			System.out.println("username and password bothe aligned");
		}
		else {
			System.out.println("username and password are not aligned ");
			
		}

		
			
		
	}

}
