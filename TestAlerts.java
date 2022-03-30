package KBMouseActions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlerts
{
WebDriver driver;
String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
	
	public void driverSetting()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup"
				+ "\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void testAlerts()
	{
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.findElement(By.name("proceed")).click();
	 
	  Alert objAlert = driver.switchTo().alert();
	  String text = objAlert.getText();
	  System.out.println(text);
	  objAlert.dismiss();
	  
	  driver.switchTo().defaultContent();
	}
	public void WinAlerts() throws Exception{
		driver.get("https://gmail.com");
		// enter a valid email address
		driver.findElement(By.id("identifierId")).sendKeys("TestSelenium1607@gmail.com");
		 
		// enter a valid password
		driver.findElement(By.id("Passwd")).sendKeys("TestSelenium");
		 
		// click on sign in button
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(30000);
		 
		// click on compose button
		driver.findElement(By.xpath("//div[@class='z0']//div[contains(text(),'COMPOSE')]")).click();
		 
		// click on attach files icon
		driver.findElement(By.xpath("//div[contains(@command,'Files')]//div[contains(@class,'aaA')]")).click();
		 
		// creating instance of Robot class (A java based utility)
		Robot rb =new Robot();
		 
		// pressing keys with the help of keyPress and keyRelease events
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		 
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		 
		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		Thread.sleep(2000);
		 
		rb.keyPress(KeyEvent.VK_P);
		rb.keyRelease(KeyEvent.VK_P);
		 
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		 
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		 
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
public static void main(String[] args) 
{
	TestAlerts obj = new TestAlerts();
	obj.driverSetting();
	//obj.testAlerts();
	try {
		obj.WinAlerts();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
