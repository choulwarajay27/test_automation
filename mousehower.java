package SeleniumTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class mousehower extends DriverSettings {
	void takess(String filename ){
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestrap = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());//timstamp
		File dest = new File("D:\\selenium\\mulss\\09032022\\"+filename+timestrap+".jpeg");
		try {
			FileHandler.copy(source, dest);
			System.out.println("Screen Captured Successfully." );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void handlerightclick(){
		driver.get("https://demoqa.com/menu");
		Actions act = new Actions(driver);
		act.contextClick().build().perform();
		takess("handlerightclick");
	}
	void mousehover(){
		driver.get("https://demoqa.com/menu");
		takess("mousehover");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Main Item 2"))).perform();
		System.out.println("done mouse hover on main menu from meny");
		takess("mousehover1");
	}
	void dragdrop(){
		driver.get("https://demoqa.com/droppable");
		Actions act = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		act.dragAndDrop(from, to).perform();	
		takess("dragdrop");
	}

	public static void main(String[] args) {
		mousehower obj = new mousehower();
		obj.handlerightclick();
		obj.mousehover();
		obj.dragdrop();
		// TODO Auto-generated method stub
	}

}
