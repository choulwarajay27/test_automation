package SeleniumTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class multiplescreenshots extends DriverSettings {
	void takess(String filename ){
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestrap = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());//timstamp
		File dest = new File("D:\\selenium\\mulss\\"+filename+timestrap+".jpeg");
		try {
			FileHandler.copy(source, dest);
			System.out.println("Screen Captured Successfully." );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	multiplescreenshots(){
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[starts-with(@role,'button')])[2]")).click();
		takess("firstss");
		/*driver.findElement(By.id("login1")).sendKeys("fdhklsdbf");
		takess("secondss");*/
	}
	
	public static void main(String[] args){
		multiplescreenshots obj = new multiplescreenshots();
	}
}
