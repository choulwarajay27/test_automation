package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excel1 {
	ArrayList al=new ArrayList();
	public void readExcel()  {

		try{
			//Create an object of File class to open xlsx file
			File file = new File("D:\\selenium\\excle\\excel.xlsx");

			//Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);

			//creating workbook instance that refers to .xlsx file
			XSSFWorkbook wb=new XSSFWorkbook(inputStream);

			//creating a Sheet object
		//	XSSFSheet sheet=wb.getSheet("Sheet1");
			XSSFSheet sheet=wb.getSheetAt(1);

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
	


}
