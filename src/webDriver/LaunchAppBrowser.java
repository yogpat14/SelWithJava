package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchAppBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
//		WebDriver driver=new FirefoxDriver();
//		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("title="+title);
		if(title.equals("Google"))
		{
			System.out.println("Title Match...");
		}
		else
		{
			System.out.println("Title Not Match...");
		}
		driver.quit();

	}

}
