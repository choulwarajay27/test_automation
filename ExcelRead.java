package ExcelTest;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//xls xlsx
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelRead {
	WebDriver driver;
	String value;
	String value1;
	String value2;
	String value3;
	@Test (priority = 2)
	public void DriverSettings(){

		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
		driver.manage().window().maximize();
	}
	@Test (priority = 3)
	void OpenBrowser()
	{
		//DriverSettings();
		driver.get(value);
		driver.findElement(By.xpath(value1)).click();
		driver.findElement(By.xpath(value2)).sendKeys(value3);
	}
	@Test(priority = 1)
	void ReadExcel(){
		try 
		{
			
			FileInputStream fs = new FileInputStream
					("D:\\selenium\\excle\\TestData\\TestData.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			//XSSFSheet objsheet =workbook.getSheetAt(0);
			XSSFSheet objsheet=workbook.getSheet("Sheet2");
			XSSFRow row = objsheet.getRow(0);
			
			 value =row.getCell(0).getStringCellValue();
			 value1 =row.getCell(1).getStringCellValue();
			 value2=row.getCell(2).getStringCellValue();
			 value3=row.getCell(3).getStringCellValue();
			 System.out.println(value);
			System.out.println(value1);
			System.out.println(value2);
		//	System.out.println(row.getCell(0).getStringCellValue());
		//	System.out.println(row.getCell(1).getStringCellValue());
		//	System.out.println(row.getCell(2).getStringCellValue());
			workbook.close();
			fs.close();

		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelRead E=new ExcelRead();
		E.ReadExcel();
		
	E.OpenBrowser();
	}*/

}