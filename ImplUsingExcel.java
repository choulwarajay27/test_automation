package openbr;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplUsingExcel {
	WebDriver driver;
	ArrayList<String> al=new ArrayList<String>();
	/*
	public String DriverPath="D:\\Selenium\\Setup\\ChromeDriver"
			+ "\\chromedriver.exe"; //91 version
	public String DriverID="webdriver.chrome.driver";
	*/
	public void DriverSettings(){
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		/*System.setProperty(DriverID, 	DriverPath);*/
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.manage().window().maximize();
	}
	public void xPathbyStartWith(){
		
		driver.get(al.get(0).toString());
		//driver.findElement(By.xpath("(//p[@id='signin_info']/a[2])")).click();
		//driver.findElement(By.xpath(al.get(1).toString())).click();
		//driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).
	//	sendKeys(al.get(2).toString());
		
	}
	
public void readExcel(String excel)  {
		
		try{
			//Create an object of File class to open xlsx file
			File file =    new File("D:\\selenium\\excle\\excel.xlsx");

			//Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);

			//creating workbook instance that refers to .xlsx file
			XSSFWorkbook wb=new XSSFWorkbook(inputStream);
			//creating a Sheet object
			XSSFSheet sheet=wb.getSheet(excel);

			//get all rows in the sheet
			int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
			
			//iterate over all the row to print the data present in each cell.
			for(int i=0;i<=rowCount;i++){

				//get cell count in a row
				int cellcount=sheet.getRow(i).getLastCellNum();
				
				//iterate over each cell to print its value
				//System.out.println("Row"+ i+" data is :");

				for(int j=0;j<cellcount;j++){
					//System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
					al.add(sheet.getRow(i).getCell(j).getStringCellValue());
				}
				//System.out.println(al);
			}
			System.out.println(al);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplUsingExcel iobj=new ImplUsingExcel();
		iobj.readExcel("Sheet1");
	//iobj.DriverSettings();
		iobj.xPathbyStartWith();

	}

}
