package openbr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	
	WebDriver d;
	void driversetting(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();	
		d.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);// time for thread
		
	}
	
	void webhp(){
		d.get("https://www.google.com/webhp");
		d.findElement(By.name("q")).sendKeys("z,mvkdfklsksurgbd.sb");
	}

	public static void main(String[] args) {
		google a = new google();
		a.driversetting();
		a.webhp();
		
		// TODO Auto-generated method stub

	}

}
