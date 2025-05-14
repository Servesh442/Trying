package alignedtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 


public class username_field_smallerthan_mo_numberfield {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement uname=driver.findElement(By.id("email"));
		int widthuname=uname.getSize().getWidth();
		System.out.println(widthuname);
		
		WebElement mobilenum=driver.findElement(By.xpath("//input[contains(@aria-label,'Email address or phone number')]"));
		int mobilenumwidth=mobilenum.getSize().getWidth();
		System.out.println(mobilenumwidth);
		
		
		//Comparison
		if(widthuname==mobilenumwidth) {
			System.out.println("Size of Both username and mobilenum fields are same"+widthuname+"="+mobilenumwidth);
		}
		
		else {
			System.out.println("Size of username and mobilenum fields are NOT same that is:"+widthuname+"Not eqauls to"+mobilenumwidth);
			
			
		}
		Thread.sleep(200);
		driver.quit();
		
	}

}
