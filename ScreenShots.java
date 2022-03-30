package SeleniumTest;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class ScreenShots extends DriverSettings {
public String s="";
	public void testscreenshot(String strURL,String filename)
	{
		
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestrap = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());//timstamp
		File dest = new File("D:\\selenium\\ss\\"+filename+timestrap+".jpeg");
		
		try {
			FileHandler.copy(source, dest);
			System.out.println("Screen Captured Successfully." );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void testactions(String sURL)
	{
		driver.get(sURL);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("UMESH");

		Actions obja = new Actions(driver);
		obja.contextClick(fname).perform();
		obja.sendKeys(Keys.PAGE_DOWN).perform();
	}

	public void testXpath(String sURL){
		driver.get(sURL);
		
		//driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//p[@id='signin_info']/a[text()='Sign in']")).click();
		//driver.findElement(By.xpath("//p[@id='signin_info']/
		//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//table[@id='tblcrtac']"
				+ "//tbody/tr[3]/td[3]/input")).sendKeys("UMESH");
	}
	public void CreateAccount(String strURL){
		//url used https://mail.rediff.com/cgi-bin/login.cgi
		
		driver.get(strURL);
		
		driver.findElement(By.xpath("//form[@name='loginform']/div[2]/div/"
				+ "a/u[text()='Create a new account']")).click();
		driver.findElement(By.xpath("//table[@id='tblcrtac']"
				+ "//tbody/tr[3]/td[3]/input")).sendKeys("UMESH");
		driver.findElement(By.xpath("//input[starts-with(@name,'login')]"))
		.sendKeys("yessinfo@rediffmail.com");
		driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]"))
		.sendKeys("YessInfo@123");
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]"))
		.sendKeys("YessInfo@123");
		driver.findElement(By.xpath("//input[@id='mobno']"))
		.sendKeys("6587985211");
		driver.findElement(By.xpath("//input[starts-with(@name,'gender')][1]"))
		.click();
		
		//s= driver.getCurrentUrl();
		
	}
	
	void TestGetAlertScreen(){
		getURL="https://mail.rediff.com/cgi-bin/login.cgi";
		driver.get(getURL);	
		driver.findElement(By.name("proceed")).click();
	}
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScreenShots sObj=new ScreenShots();
		
		
		
		sObj.testscreenshot("https://mail.rediff.com/cgi-bin/login.cgi","RediffScreen1");
		//sObj.testscreenshot("https://www.moneycontrol.com","money");
	}*/
}
