package webDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

    public static void main(String[] args) 
    {
        WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();

        ArrayList<String> tableData = new ArrayList<>();

        WebElement tableElement = driver.findElement(By.id("table1"));
//        WebElement tableElement = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody"));

        for (WebElement row : tableElement.findElements(By.tagName("tr"))) 
        {
            for (WebElement cell : row.findElements(By.tagName("td"))) 
            {
                tableData.add(cell.getText());
            }
        }
        for (String data : tableData) 
        {
            System.out.println(data);
        }driver.quit();
    }
}