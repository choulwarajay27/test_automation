package openbr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class facebook {
	
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
	void radio(){
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("ajay");
		driver.findElement(By.name("lastname")).sendKeys("ajay");
		driver.findElement(By.name("reg_email__")).sendKeys("ajaychoulwar@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ajaychoulwar@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("@CHoufbvlbad25");
		
		driver.findElement(By.name("birthday_day")).sendKeys("25");
		driver.findElement(By.id("month")).sendKeys("Mar");
		driver.findElement(By.id("year")).sendKeys("1995");
		/*
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select obj1 = new Select(day);
		obj1.selectByValue("5");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select obj2 = new Select(month);
		obj2.selectByValue("5");
		*/
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
		
	}
	
	void att(){
		driver.get("https://www.att.com/");
		driver.findElement(By.xpath("//div[@id='HEADBAND0']//child::li[4]//a")).click();
	}
	/*
	public static void main(String[] args){
		facebook obj = new facebook();
		obj.driversetting();
		obj.att();
		
	}*/

}
