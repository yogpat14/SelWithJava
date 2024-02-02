package webDriver;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
public class TableDataExa 
{ 
	public static void main(String[] args) { 

		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();

		String innerText = driver.findElement
		(By.xpath("//html/body/div[2]/div/div/table[1]")).getText(); 	
		System.out.println(innerText); 
		driver.quit();
	}
}