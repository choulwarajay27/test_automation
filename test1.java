package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	
	WebDriver d;
	@Test
	void driver(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browsers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
		d.manage().window().maximize();
	}
	@Test
	void rediff(){
		d.get("https://www.rediff.com/");
		d.findElement(By.linkText("Sign in")).click();
		d.findElement(By.id("login1")).sendKeys("rediif27");
		d.findElement(By.xpath("//input[@name = 'proceed']")).click();
		
		Alert obj = d.switchTo().alert();
		String text = obj.getText();
		System.out.println(text);
		obj.dismiss();
		String actmessg = "Please enter your password1";
		if (actmessg.equalsIgnoreCase(text)){
			System.out.println("Pass : message apperaring as expected ");
		}
		else{
			System.out.println("Fail : message appearing is not expected ");
		}
	}
}
