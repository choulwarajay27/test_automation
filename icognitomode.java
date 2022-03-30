package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class icognitomode {
	
		public String strUserName;
		public String strPassword;
		String getURL="";
		WebDriver driver;
		public String DriverPath="D:\\selenium\\browsers\\chromedriver.exe"; 
		@Test
		void DriverSettings(){

			System.setProperty("webdriver.chrome.driver", 
					DriverPath);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver=new ChromeDriver(options);
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
			driver.manage().window().maximize();
			
		

	}


}
