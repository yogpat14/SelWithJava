package webDriver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class Testing1 
{
	@Test
	public void amazonProductSearch() throws InterruptedException, IOException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();
			
			int totalColumns = driver.findElements(By.xpath("/html/body/form/fieldset/div/div/table/thead/tr")).size();
			int totalRows = driver.findElements(By.xpath("/html/body/form/fieldset/div/div/table/tbody/tr/td")).size();

			List<LinkedHashMap<String, String>> allTableData = new ArrayList<LinkedHashMap<String, String>>();
			LinkedHashMap<String, String> tableData = null;
			for(int row=1; row<=totalRows; row++)
				{
					tableData = new LinkedHashMap<String, String>();
					for(int i=1; i<totalColumns; i++)
					{
						String header =driver.findElement(By.xpath("/html/body/form/fieldset/div/div/table/thead/tr)["+i+"]")).getText();
						String value = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/table/tbody/tr["+row+"]/td["+i+"]")).getText();
						tableData.put(header, value);
					}
					allTableData.add(tableData);
				}
			System.out.println(allTableData);
			driver.quit();
	}
}
