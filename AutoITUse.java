package SeleniumTest;

import java.io.IOException;

import org.openqa.selenium.By;

public class AutoITUse extends DriverSettings {
	public void UsingAutoIT()
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		//driver.findElement(By.id("pickfiles")).click();
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		
		try 
		{
			Runtime.getRuntime().exec("D:\\Selenium\\AutoIt\\FileUpload.exe");
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoITUse aObj=new AutoITUse();
		aObj.UsingAutoIT();

	}

}
