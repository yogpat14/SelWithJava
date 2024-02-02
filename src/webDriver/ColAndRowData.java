package webDriver;

import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; 
public class ColAndRowData 
{ 
	public static void main(String[] args) { 

		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();

		//No.of Columns
        List <WebElement> col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
		driver.quit();
	}
}