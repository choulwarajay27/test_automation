import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class testss {
	WebDriver drivetr;
	public String s="";
	@Test (priority=0)
	void driver(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browsers\\chromedriver.exe");
		drivetr = new ChromeDriver();
		drivetr.manage().window().maximize();
		drivetr.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
	}
	@Test (priority=3)
	void ss(){
		File source = ((TakesScreenshot)drivetr).getScreenshotAs(OutputType.FILE);
		String timestrap = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File dest = new File("D:\\selenium\\ss\\"+"redcc"+timestrap+".jpeg");
		try{
			FileHandler.copy(source, dest);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	@Test (priority=1)
	void testactions()
	{
		drivetr.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//drivetr.findElement(By.name("//input[@name]")).sendKeys("ss");
	}

}
