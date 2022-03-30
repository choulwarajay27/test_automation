package openbr;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelpfacebook {
	WebDriver d;
	ArrayList<String> al=new ArrayList<String>();
	
	
	void driver(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
	}
	void excel(){
		/*File path = new File ("D:\\selenium\\excle\\excel.xlsx");
		FileInputStream inputstream = new FileInputStream(path);
		XSSFWorkbook wk =new XSSFWorkbook(inputstream);
		XSSFSheet sheet = wk.getSheet("Sheet1");
		*/
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args){
		excelpfacebook obj = new excelpfacebook();
		obj.driver();
		obj.excel();
		
		
		
	}

}
