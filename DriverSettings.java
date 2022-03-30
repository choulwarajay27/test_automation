package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSettings {
	public String strUserName;
	public String strPassword;
	String getURL="";
	WebDriver driver;
	public String DriverPath="D:\\selenium\\browsers\\chromedriver.exe"; 
	DriverSettings(){

		System.setProperty("webdriver.chrome.driver", 
				DriverPath);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		
	}

}
