import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class axeslocators {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		//self
		String text=driver.findElement(By.xpath("//a[contains(text(),'Natco Pharma')]/self::a")).getText();
		System.out.println(text);
		
		//Parent
		text=driver.findElement(By.xpath("//a[contains(text(),'Natco Pharma')]/parent::td")).getText();
		System.out.println(text);
		
		 //child  List<WebElement> used to store the data Because multiple elements 
		 List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Natco Pharma')]/ancestor::tr/child::td"));
		 System.out.println("no of child elems:"+childs.size());
		
		    
		  //ancestor ( parent , grandparent, etc).
		// here ancestor is going to be 1 only thats why i sued text  to store its value  and that printed it 
		text=driver.findElement(By.xpath("//a[contains(text(),'Natco Pharma')]/ancestor::tr")).getText();
		System.out.println(text);
		
		//descendants ? select all descendats <children, grandchildren, etc> of the current node
		//List<WebElement> used to store the data Because multiple elements 
		 List<WebElement> descendants =driver.findElements(By.xpath("//a[contains(text(),'Natco Pharma')]/ancestor::tr/descendant::*"));
		 System.out.println("no of descendants:"+descendants.size());
		
		
		//Following(niche wale below ones) - select evertyhing from the document after closing tag of current node
		
		List<WebElement> followingNodes=driver.findElements(By.xpath("//a[contains(text(),'Natco Pharma')]/ancestor::tr/following::tr"));
		System.out.println("no of following nodes:"+followingNodes.size());
		
		
		//following - sibling: select all siblings after current node.
		List<WebElement> followingsibling =driver.findElements(By.xpath("//a[contains(text(),'Natco Pharma')]/ancestor::tr/following-sibling::tr"));
	    System.out.println("no of siblings"+followingsibling.size());
	    
	    
	    // Preceding = select all nodes that are above current node in the documnet( sare uppar wale)
	    List<WebElement> preceding=driver.findElements(By.xpath("//a[contains(text(),'Natco Pharma')]/ancestor::tr/preceding::tr"));
		System.out.println("no of preceding :"+preceding.size());
		
		
		// Preceding-Sibling = select all the sibling before the current node 
		List<WebElement> precedingsibling=driver.findElements(By.xpath("//a[contains(text(),'Natco Pharma')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("no of siblings:"+precedingsibling.size() );
		
		
		
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
