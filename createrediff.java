package openbr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createrediff {
	WebDriver driver;
	void driversetting(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	void typrtext(){
		driver.get("https://www.mail.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("login-email")).sendKeys("bhksdhdfbj");
		driver.findElement(By.id("login-password")).sendKeys("bhksdhdfbj");
		//driver.findElement(By.linkText("Home")).click();//click on home
		//driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("dfkjhfdsd");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dfkjhfdsd");
		//input[starts-with(@name,'name')]
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createrediff obj = new createrediff();
		obj.driversetting();
		obj.typrtext();

	}

}
