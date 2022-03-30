package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class redi {
	WebDriver qa;
	@Test
	void acc(){
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\browsers\\chromedriver.exe");
		qa = new ChromeDriver();
		
	}
	@Test
	void att(){
		qa.get("https://www.rediff.com/");
		qa.findElement(By.linkText("Sign in")).click();
		qa.findElement(By.xpath("//input[@id ='login1']")).sendKeys("dhhsd");
		
	}
	

}
