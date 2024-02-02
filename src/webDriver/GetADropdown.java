package webDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
 
public class GetADropdown {
	
  	@Test
  	public void headingText(){
  		WebDriver driver = new FirefoxDriver();
  	  	driver.get("https://demoqa.com/select-menu");
  		driver.manage().window().maximize();
        	
        	WebElement dropedown = driver.findElement(By.id("oldSelectMenu"));
        	System.out.println("Clicking on the drop down");
        	Select se = new Select(dropedown);
        	
        	List<WebElement> opt = se.getOptions();
        	
        	System.out.println("The total number of options in the dropdown is : " +opt.size());
        	
        	System.out.println("The dropdown values are--- ");
        	
        	for(WebElement options : opt)
        	{
              	System.out.println(options.getText());
        	}driver.quit();
              	
  	}
  	
}