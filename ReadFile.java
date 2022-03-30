package Excel;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {
	String value;
	String value1;
	XSSFWorkbook workbook;
	XSSFSheet objsheet;
	XSSFRow Row;
	void Readexcel(){
		ArrayList<String> al=new ArrayList<String>();
		try{
			FileInputStream fs = new FileInputStream
					("D:\\selenium\\excle\\excel1.xlsx");
			workbook = new XSSFWorkbook(fs);
			objsheet =workbook.getSheetAt(0);
			
			
			int rowCount=objsheet.getLastRowNum()-objsheet.getFirstRowNum();
			//Row = objsheet.getRow(0);
			//value =Row.getCell(0).getStringCellValue();
			// value1 =Row.getCell(1).getStringCellValue();
			for(int i =0; i<=rowCount;i++ ){
				int cellcount = objsheet.getRow(i).getLastCellNum();
				for(int j =0; j<=cellcount;j++){
					System.out.println(objsheet.getRow(i).getCell(j).getStringCellValue()+",");
					//al.add(objsheet.getRow(i).getCell(j).getStringCellValue());
				}	
			}
			//System.out.println(value);
				//System.out.println(value1);
				workbook.close();
				fs.close();
				System.out.println(al);
				
			 
		}catch (Exception e) 
		{
			e.printStackTrace();
			//System.out.println("Blank Value");
		}
		
	}
	
		
	
	public static void main(String[] args){
		ReadFile RF=new ReadFile();
		RF.Readexcel();

	}

}
