package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork extends DriverSettings
{
	WebDriver driver;
	public String DriverPath="D:\\Selenium\\Setup\\ChromeDriver"
			+ "\\chromedriver.exe"; //91 version
	//public String DriverPath="D:\\Selenium\\Setup\\ChromeDriver\\"
	//		+ "chromedriver_win32\\chromedriver.exe";
	public void DriverSettings(){

		System.setProperty("webdriver.chrome.driver", 
				DriverPath);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
		driver.manage().window().maximize();
	}
	public void UseXpath(){
		driver.get("https://www.rediff.com/");
	}
	public void testNavigation()
	{
		Navigation obj = driver.navigate();
		obj.to("https://www.facebook.com/");
		obj.to("https://www.google.co.in/");
		obj.to("https://www.rediffmail.com/");
		obj.back();
		obj.refresh();
		obj.forward();
		obj.back();
	//	driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
	}

}
