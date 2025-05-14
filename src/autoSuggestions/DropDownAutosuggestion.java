package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com/");	
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	    Thread.sleep(4000);
	    // so here we have to manufacture xpath with selenium keyword using contains method.
	    List<WebElement> allsuggestions = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
	    
	    int count = allsuggestions.size();
	    System.out.println("no of values present in the drop down:::"+count);
	    
	    //declares a variable named expectedValue of type String 
	    //and assigns it the value "selenium interview questions"
	    String expectedVlaue= "selenium interview questions";
	    
	    
	    //Print all the auto suggestion values
	    //This loop iterates(goes through) through each WebElement object in the allsuggestions collection.
	    //it grabs the text that's visible on the webpage and then prints it out on the console
	    for(WebElement option:allsuggestions) {
	    	
	    	String text = option.getText();
	    	System.out.println(  "::"+text);
	    	
	    	//Click on Java Interview Questions
	    	if(text.equalsIgnoreCase(expectedVlaue)) {
	    		option.click();
	    		Thread.sleep(4000);
	    		
	    		break;//break; statement is used to terminate the execution of a loop.
	    		
	    		
	    		
	    		
	    		
	    	}
	    	
	    }
	    
	   
	    
	    
	    
		
	
	
	}

}
