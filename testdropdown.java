package openbr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testdropdown {
	WebDriver driver;
	
	void driversetting(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
	}
	
	void dropdown(){
		driver.get("https://login.yahoo.com/?");
		driver.findElement(By.id("createacc")).click();
		driver.findElement(By.name("firstName")).sendKeys("dgjkjaf");
		driver.findElement(By.name("lastName")).sendKeys("dgjkjaf");
		driver.findElement(By.id("usernamereg-yid")).sendKeys("fvhhvsd");
		
		
		WebElement month = driver.findElement(By.name("mm"));
		Select objm = new Select(month);
		//objm.selectByIndex(8);
		//objm.selectByVisibleText("February");
		objm.selectByValue("5");
		
		driver.findElement(By.name("dd")).sendKeys("25");
		driver.findElement(By.name("yyyy")).sendKeys("1995");
		
	}
	void google(){
		driver.get("https://www.google.com/webhp");
		driver.findElement(By.name("q")).sendKeys("bvjfv");
	}
	
	public static void main(String[] args) {
		testdropdown obj = new testdropdown();
		obj.driversetting();
		obj.dropdown();
	}
	

}
