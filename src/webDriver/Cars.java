package webDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");

		Select opts=new Select(driver.findElement(By.id("cars")));

		if(opts.isMultiple()){

            opts.selectByIndex(2);

            opts.selectByValue("saab");

            opts.selectByVisibleText("Audi");

            System.out.println("The selected values in the dropdown options are -");
            
            driver.findElements(By.xpath("/html/body/form/input"));

            List<WebElement> selectedOptions = opts.getAllSelectedOptions();

            for(WebElement selectedOption: selectedOptions)
                System.out.println(selectedOption.getText());

		driver.quit();

		}

	}
}
