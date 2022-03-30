package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test2 {
	WebDriver d;
	String text;
	@Test
	void driver(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browsers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
		d.manage().window().maximize();
	}
	@SuppressWarnings("unused")
	@Test
	void driver1(){
		d.get("https://demoqa.com/checkbox");
		d.findElement(By.xpath("//span[@class = 'rct-checkbox' ]")).click();
		
		/*System.out.println(d.getTitle());
		String actmessg = "ToolsQA";
		if(actmessg.equalsIgnoreCase(d.getTitle())){
			System.out.println("Pass : message apperaring as expected ");
		}
		else{
			System.out.println("Fail : message appearing is not expected ");
		}*/
	}
	
	void driver2(){
		d.get("https://demoqa.com/checkbox");
		Actions act = new Actions(d);
		act.contextClick().build().perform(); 
		
	}

}
