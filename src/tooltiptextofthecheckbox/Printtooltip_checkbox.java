package tooltiptextofthecheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printtooltip_checkbox {

	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");	
		
	    String elementType=driver.findElement(By.className("//*[@class='rct-icon rct-icon-uncheck']")).getAttribute("stroke");
	   
	    System.out.println(elementType);
	    
	     if(elementType.equalsIgnoreCase("checkbox"));
	     
	     System.out.println("it is a check box");
	
	
	    
	   
	
		
		//System.out.println("not a check box");
		
		
	    	
	}
	
}
	
	

	
	



