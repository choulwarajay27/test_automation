package openbr;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkinsta {
		
		WebDriver driver;
		void driversetting(){
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);// time for thread
		}
		

	void openurl(){
		driver.get("https://online.tatamutualfund.com/transact");
		
		driver.findElement(By.id("username")).sendKeys("rahul");
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
	}
	
	public static void main(String[] args){
		checkinsta obj = new checkinsta();
		obj.driversetting();
		obj.openurl();
	}

}
