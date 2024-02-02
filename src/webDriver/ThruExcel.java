package webDriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ThruExcel {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	FileInputStream fis;
	String src="C:\\Users\\yoges\\OneDrive\\Desktop\\Selenium\\datasheet.xlsx";

	@Test
	public void readData() throws IOException
	{
		fis=new FileInputStream(src);
		wb=new XSSFWorkbook (fis);
		sheet=wb.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		int colCount=sheet.getRow(0).getLastCellNum();
		System.out.println(rowCount+ " : "+ colCount);
		for(int i=1;i<rowCount;i++)
		{
			for (int j=0;j<colCount;j++)
				{
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				}
		}
		wb.close();
	}
}
