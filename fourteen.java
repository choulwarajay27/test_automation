package openbr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourteen {
	WebDriver driver;
	void driversetting(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);// time for thread
	}
	

void openurl(){
	driver.get("https://online.tatamutualfund.com/transact");
	
	driver.findElement(By.name("username")).sendKeys("rahul");
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
}
void navigate(){//navigate
	Navigation obj = driver.navigate();
	obj.to("https://www.youtube.com/");
	obj.to("https://www.moneycontrol.com/stocksmarketsindia/");
	obj.to("https://www.selenium.dev/");
	obj.to("https://www.facebook.com/");
	obj.to("http://www.starengineersindia.com/");
	obj.to("https://engineering.careers360.com/articles/will-jee-main-syllabus-be-reduced");
	obj.refresh();
	obj.back();
	obj.forward();
	obj.back();
	obj.refresh();
}


public static void main(String[] args){
	fourteen obj = new fourteen();
	obj.driversetting();
	obj.navigate();
	obj.openurl();
	
}


}
