package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vindeep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
//		WebDriver driver=new FirefoxDriver();
//		WebDriver driver=new EdgeDriver();
		driver.get("https://vindeep.com/Calculators/FDCalc.aspx");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("title="+title);
		if(title.equals("Fixed Deposit Calculator | Calculate FD Interest, Maturity value"))
		{
			System.out.println("Title Match...");
		}
		else
		{
			System.out.println("Title Not Match...");
			driver.findElement(By.id("dContentPlaceHolder1_cphCentre_FDAmount")).clear();
//			driver.findElement(By.id("dContentPlaceHolder1_cphCentre_FDAmount")).sendKeys(2000);
			
		}
		driver.quit();

	}

}
