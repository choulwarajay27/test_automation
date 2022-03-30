package openbr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testalerts {
	WebDriver a;
	void driversetting(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		a= new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	}
	
	
	void alert()
	{
		a.get("https://mail.rediff.com/cgi-bin/login.cgi");
		a.findElement(By.id("password")).sendKeys("dfhliaghul");
		a.findElement(By.name("proceed")).submit();
		
		Alert objalert = a.switchTo().alert();
		String text = objalert.getText();
		String actmessg = "Please enter a valid user name";
		if(actmessg.equalsIgnoreCase(text)){
			System.out.println("Pass : message apperaring as expected ");
		}
		else{
			System.out.println("Fail : message apperaring is not expected ");
		}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testalerts j = new testalerts();
		j.driversetting();
		j.alert();
		

	}

}
