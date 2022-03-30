package KBMouseActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	WebDriver driver;
	public void DriverSettings(){
		//THIS METHOD SETS THE PATH TO OPEN THE SPECIFIED WEB BROWSER
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium\\Setup\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();//assigning object of Chrome Driver.

		driver.manage().window().maximize();
		driver.get("https://google.co.in");
	}
	void chkRightClick() throws InterruptedException{
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.contextClick().build().perform(); 
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		RightClick RC=new RightClick();
		RC.DriverSettings();
		try {
			RC.chkRightClick();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
