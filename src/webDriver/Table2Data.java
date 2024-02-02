package webDriver;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
public class Table2Data 
{ 
	public static void main(String[] args) { 
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html#google_vignette");
		driver.manage().window().maximize();

		String innerText = driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[1]/div[5]")).getText(); 	
		System.out.println(innerText); 
		driver.quit();
	}
}