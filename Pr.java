package openbr;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pr {
	WebDriver D;
	
	String v;
	String v1;
	XSSFWorkbook workbook;
	XSSFSheet Objsheet;
	XSSFRow row;
	ArrayList<String> al = new ArrayList<String>();
	void readex(){
		
		FileInputStream fs;
		try {
			fs = new FileInputStream("D:\\selenium\\excle\\excel1.xlsx");
			workbook = new XSSFWorkbook(fs);
			Objsheet =workbook.getSheetAt(0);
			int rowCount=Objsheet.getLastRowNum()-Objsheet.getFirstRowNum();
			for(int i =0; i<=rowCount;i++ ){
				int cellcount = Objsheet.getRow(i).getLastCellNum();
				for(int j =0; j<=cellcount;j++){
					al.add(Objsheet.getRow(i).getCell(j).getStringCellValue());
				}
		} 
			workbook.close();
			fs.close();
			
		}
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	void driver(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		D = new ChromeDriver();
		D.manage().window().fullscreen();
		D.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
		}
	void facebook(){
		D.get("https://www.facebook.com/");
		D.findElement(By.name("email")).sendKeys(al.get(0));
		D.findElement(By.name("pass")).sendKeys(al.get(1));
		D.get("https://www.facebook.com/");
		D.findElement(By.name("email")).sendKeys(al.get(2));
		
	}
		public static void main(String[] args){
			Pr RF=new Pr();
				
			RF.readex();
			RF.driver();
			RF.facebook();
		
		
	}
	
	

}
