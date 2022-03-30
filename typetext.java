package openbr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class typetext {
	WebDriver driver;
	void driversetting(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
	}
	void openred(){
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//p[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("//form[@name='loginform']/div[1]/div[2]/div[1]/div[2]/input[@id='login1']")).sendKeys("dshvkdbsfv");
		driver.findElement(By.xpath("//form[@name='loginform']/div[1]/div[2]/div[2]/div[2]/input[@id='password']")).sendKeys("dshvkdbsfv");
		driver.findElement(By.name("proceed")).click();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typetext obj = new typetext();
		obj.driversetting();
		obj.openred();
		
	}



}
