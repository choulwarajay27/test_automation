package openbr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbr {
	
	WebDriver driver;
	void driversetting(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	void openurl(){
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin#inbox");
		driver.findElement(By.id("identifierId")).sendKeys("rahul");
		//driver.findElement(By.name("login")).sendKeys("rahul");
		//driver.findElement(By.id("login1")).sendKeys("rahul");

		
	}
	
	
	
	public static void main(String[] args){
		openbr obj = new openbr();
		obj.driversetting();
		obj.openurl();
		
		
	}

}
