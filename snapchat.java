package openbr;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapchat {
	WebDriver driver;
	void driversetting(){
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	}
	
	
	void account(){
		driver.get("https://accounts.snapchat.com/accounts/login?continue=%2Faccounts%2Fwelcome");
		driver.findElement(By.xpath("//div[@class='create-account-cta']//a[1]")).click();
		driver.findElement(By.xpath("//option[@value='IN']")).click();
		driver.findElement(By.xpath("//input[@class='phone-input']")).sendKeys("996098113");
		driver.findElement(By.xpath("//button[@class='send-button']")).click();
		
	}
	public static void main(String[] args){
		snapchat obj = new snapchat();
		obj.driversetting();
		obj.account();
	}

}
