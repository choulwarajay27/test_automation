package TestNGbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sp {
	WebDriver driver;
	@Test(priority=1)
	void driversetting(){
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	}
	@Test(priority=2)
	void att1(){
		driver.get("https://www.att.com/");
		//driver.findElement(By.xpath("//div[@id='HEADBAND0']//child::li[4]//a")).click();
		driver.findElement(By.xpath("//div[@id='z1-tier1Nav']//a[5]")).click();
	}


}
