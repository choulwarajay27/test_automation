package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yespr {
	
	WebDriver driver;
	void driver1(){
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
		driver.manage().window().maximize();

	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yespr obj = new yespr();
		obj.driver1();

	}

}
