package KBMouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {
	WebDriver driver;
	public void DriverSettings(){
		//THIS METHOD SETS THE PATH TO OPEN THE SPECIFIED WEB BROWSER
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium\\Setup\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();//assigning object of Chrome Driver.

		driver.manage().window().maximize();
		//Adding wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	}

	void Tooltipdemo(){
		//CASE 1: Using getAttribute 
		// Launch the URL 
		driver.get("https://demoqa.com/tool-tips/");
		System.out.println("Tooltip web Page Displayed");

		//Maximise browser window 
		driver.manage().window().maximize();

		// Get element for which we need to find tooltip 
		WebElement ageTextBox = driver.findElement(By.id("toolTipTextField"));

		//Get title attribute value 
		String tooltipText = ageTextBox.getAttribute("title"); 

		System.out.println("Retrieved tooltip text as :"+tooltipText); 

		//Verification if tooltip text is matching expected value 
		if(tooltipText.equalsIgnoreCase("You Hovered over the Text field")){ 
			System.out.println("Pass : Tooltip matching expected value");
		}
		else{ 
			System.out.println("Fail : Tooltip NOT matching expected value"); 
		}
	}
	void CaptureTooltip(){
		//CASE 2 : Using Actions class method 
		driver.get("https://demoqa.com/tool-tips"); 

		System.out.println("demoqa webpage Displayed"); 

		//Maximise browser window 
		driver.manage().window().maximize(); 

		//Instantiate Action Class 
		Actions actions = new Actions(driver); 

		//Retrieve WebElement  toolTipButton
		WebElement element = driver.findElement(By.id("toolTipTextField")); 

		// Use action class to mouse hover 
		actions.moveToElement(element).perform(); 

		WebElement toolTip = driver.findElement(By.id("toolTipButton")); 
		actions.moveToElement(toolTip).perform(); 
		// To get the tool tip text and assert 
		String toolTipText = toolTip.getText();
		System.out.println("toolTipText-->"+toolTipText); 

		//Verification if tooltip text is matching expected value 
		if(toolTipText.equalsIgnoreCase("Hover me to see")){ 
			System.out.println("Pass* : Tooltip matching expected value");
		}else{
			System.out.println("Fail : Tooltip NOT matching expected value"); 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToolTip tt=new ToolTip();
		tt.DriverSettings();
		//tt.Tooltipdemo();
		//tt.CaptureTooltip();
	}

}
