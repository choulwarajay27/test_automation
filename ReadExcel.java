package ExcelTest;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {
	ArrayList al=new ArrayList();

	public void readExcel()  {

		try{
			//Create an object of File class to open xlsx file
			File file = new File("D:\\Selenium\\TestData\\TestData.xlsx");

			//Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);

			//creating workbook instance that refers to .xlsx file
			XSSFWorkbook wb=new XSSFWorkbook(inputStream);

			//creating a Sheet object
		//	XSSFSheet sheet=wb.getSheet("Sheet1");
			XSSFSheet sheet=wb.getSheetAt(0);

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
				
			}
			System.out.println(al);
			//System.out.println(al.get(2));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void ReadaCell(){
		try{
			//Create an object of File class to open xlsx file
			File file =    new File("D:\\Selenium\\TestData\\TestData.xlsx");

			//Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);

			//creating workbook instance that refers to .xlsx file
			XSSFWorkbook wb=new XSSFWorkbook(inputStream);

			//creating a Sheet object
			XSSFSheet sheet=wb.getSheet("Sheet1");
			System.out.print(sheet.getRow(0).getCell(0).getStringCellValue() +",");
			System.out.print(sheet.getRow(0).getCell(1).getStringCellValue()+",");
			System.out.print(sheet.getRow(0).getCell(2).getStringCellValue() +",");
			System.out.print(sheet.getRow(0).getCell(3).getStringCellValue() );
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadExcel obj=new ReadExcel();
		obj.readExcel();
		 //System.out.println(obj.al.get(2).toString());
		//obj.ReadaCell();

	}

}