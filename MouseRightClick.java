package KBMouseActions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class MouseRightClick {
	WebDriver driver;
	String timeStamp;
	public void DriverSettings(){
		//THIS METHOD SETS THE PATH TO OPEN THE SPECIFIED WEB BROWSER
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium\\Setup\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();//assigning object of Chrome Driver.

		driver.manage().window().maximize();
		//Adding wait 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	                
		//driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	public void HandleRightClick() {
		driver.get("https://demoqa.com/menu/");
		Actions act = new Actions(driver);
		act.contextClick().build().perform();              //Right Click = Single Click
		testscreenshot("RightClick");
	}
	public void testscreenshot(String s)
	{
		
		//This line creates a image file
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File dest = new File("D:\\Selenium\\ScreenShot\\"+s+timeStamp+" .png");

		try {
			FileHandler.copy(source, dest);
			System.out.println("Screen Captured Successfully." );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void DoubleClick(){
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement uname = driver.findElement(By.id("txtUsername"));  
		uname.sendKeys("Admin");
		
		WebElement pwd = driver.findElement(By.name("txtPassword")); 
		pwd.sendKeys("admin123");

		WebElement login_button = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		login_button.click();                          //loginbutton

		//WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		//WebElement admin = driver.findElement(By.id("menu_pim_viewPimModule")); 
		WebElement admin = driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")); 
		
		Actions act = new Actions(driver);
		
		act.doubleClick(admin).build().perform();              //Double Click = Left Click)
	//	act.doubleClick(admin).build().perform();
		
	}
	public void MouseHover(){
		driver.get("https://demoqa.com/menu/");
		Actions actions = new Actions(driver);
       actions.moveToElement(driver.findElement(By.linkText("Main Item 2"))).perform();
       testscreenshot("MouseHover");
       System.out.println("Done Mouse hover on 'Main Item 2' from Menu");
    }
	public void DragDrop(){
		driver.get("https://demoqa.com/droppable/");
				//Actions class method to drag and drop		
				Actions act = new Actions(driver);
				WebElement from = driver.findElement(By.id("draggable"));
				WebElement to = driver.findElement(By.id("droppable"));	 
				//Perform drag and drop
				act.dragAndDrop(from, to).perform();
				}
	public void KeyBoardEvents(){
		driver.get("https://demoqa.com/text-box");
	       
        // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Tongo Volcano");
        
        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("WeareLearning@Learnyourself.com");
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("All India Road 25 Jagary Pune");
        
        // Copy the Current Address
        currentAddress.sendKeys(Keys.CONTROL);
        currentAddress.sendKeys("A");
        currentAddress.sendKeys(Keys.CONTROL);
        currentAddress.sendKeys("C");
        
        //Press the TAB Key to Switch Focus to Permanent Address
        currentAddress.sendKeys(Keys.TAB);
        
        //Paste the Address in the Permanent Address field
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(Keys.CONTROL);
        permanentAddress.sendKeys("All India Road 25 Jagary Pune");
        
        //Compare Text of current Address and Permanent Address
        if(currentAddress.getAttribute("value").equalsIgnoreCase(permanentAddress.getAttribute("value"))){
        	System.out.println("Value Matches");
        }
        

	}
	public static void main(String[] args){
		MouseRightClick objM=new MouseRightClick();
		//objM.DriverSettings();
		/*try {
			objM.HandleRightClick();
		//objM.driver.close();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		objM.DriverSettings();
		objM.HandleRightClick();
		//objM.DoubleClick();
	objM.MouseHover();
	//objM.DragDrop();
		
		objM.KeyBoardEvents();
	}
}