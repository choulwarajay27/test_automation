package openbr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo {
	
	WebDriver a;
	void webd(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		a= new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yahoo v = new yahoo();
		

	}

}
