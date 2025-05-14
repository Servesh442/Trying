package selectClassListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/servesh/Desktop/new%20webpage.html");
		driver.manage().window().maximize();
		
		WebElement list = driver.findElement(By.id("\\'93mar\\'94"));
		
		//Create an object of Select class 
		//and pass the address of list box as an argument
		Select sel= new Select(list);
		
		//getOptions() method returns a list of all the elements of the list box		
	     List<WebElement> alloptions = sel.getOptions();
	     int size = alloptions.size();
	     System.out.println("no of options presnet"+size);
	     
	     //Print all the elements present in the list box
         //here element is a variable For each iteration,the current element is
	     //assigned to the variable 
	     for(WebElement element:alloptions) {
	    	 String text = element.getText();
	    	 System.out.println(text);
	     }
	    	 
        //selectByIndex() selects an element based on the Index, here index starts with 0
	    	 sel.selectByIndex(0);
	    	 sel.selectByValue("\\'93D\\'94");
	    	 sel.selectByVisibleText("poori");
	    	 
	    	 System.out.println(":::::::::::::::::print all selected options:::::");
	    	 List<WebElement> allselectedoptions = sel.getAllSelectedOptions();
	    	 int size2 = allselectedoptions.size();
	    	 System.out.println("no of selected options===="+size2);
	    	 
	    	 System.out.println("selected items are printed below");
	 //for eachloop goes through every element of allselectedoptions and stores it in elem variable   	 
	    	 for(WebElement elem:allselectedoptions) {
	    	//this sysout prints names of selected options using .getText()	 
	    		 System.out.println(elem.getText());
	    		 
	    	 }
	    	 
	    	 
	    	 System.out.println("check whether it is a multiple select listbox or not");
	    	 //sel is a variable assigned above to select class.
	    	 boolean multiple = sel.isMultiple();
	    	
	    	 
	    	 System.out.println(multiple+"==yes it's a multiple list box");
	    	 
	    	 if (multiple) {
              //Print the first selected option in the list box.
	    		
	    		 WebElement get1stselectedoption = sel.getFirstSelectedOption();
	    		 System.out.println(get1stselectedoption.getText()+"is the 1st selected item in the list box");
	    		 
	    		//deselect the item present in 0th index.
	    		  sel.deselectByIndex(0);
	    		//Print the first selected option in the list box
	    		 WebElement firstopt = sel.getFirstSelectedOption();
	    		 System.out.println(firstopt.getText()+"==is the 1st selected option");
	    		 
	    		//deselect an item which has an attribute called value and its value is v
            		 sel.deselectByValue("\\'93D\\'94");
	    		 
	    		 WebElement firstopt3 = sel.getFirstSelectedOption();
	    		 System.out.println(firstopt3.getText()+"==is the 1st selected option");
	    		 
		         //deselect an by using visibletext().
	    		 sel.deselectByVisibleText("VADA");
	    		 WebElement firstopt4 = sel.getFirstSelectedOption();
	    		 System.out.println(firstopt4.getText()+"==is the 1st selected option");
	    		 
	    		 

	    	 //try this program again with each method in seperate new classes for each method.
	    		 
	    	 
	    	 
	    	 
	    	 driver.quit();
	}	    	 
	
}
}
	
