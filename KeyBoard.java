package KBMouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {
	WebDriver driver;
	public void DriverSetting(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
		driver.manage().window().maximize();
	}
	
	void KeyboardEventsUsingActions (){
		driver.get("https://demoqa.com/text-box");

		//Create object of the Actions class
		Actions actions = new Actions(driver);

		// Enter the Full Name
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Mr.Who AM I");
		
		//Enter the Email
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("WhoamI@gmail.com");

		// Enter the Current Address
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));

		currentAddress.sendKeys("Scrambling World at no home ");

		// Select the Current Address using CTRL + A
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();

		// Copy the Current Address using CTRL + C
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();

		//Press the TAB Key to Switch Focus to Permanent Address
		actions.sendKeys(Keys.TAB);
		actions.build().perform();

		//Paste the Address in the Permanent Address field using CTRL + V
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();

		//Compare Text of current Address and Permanent Address
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyBoard kb=new KeyBoard();
		kb.DriverSetting();
		//kb.KeyboardEventsUsingActions();
	}

}
