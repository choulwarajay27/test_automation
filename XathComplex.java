//FACE book (//input[@name='sex'])[1]
//att.com //div[@id='HEADBAND0']//following::li[1]//a
package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//links used https://www.facebook.com/
public class XathComplex extends DriverSettings{
	public void SimpleXpath(String sURL){
		driver.get(sURL);
		// (//a[starts-with(@role,'button')])[2]
		driver.findElement(By.xpath("(//a[@role= 'button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("FB FirstName");
		driver.findElement(By.name("lastname")).sendKeys("FB LastName");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("LMNOP@QRST.com");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("1235647777");
		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("MyPassword");
		WebElement Day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select objDay = new Select(Day);
		Select objMonth = new Select(month);
		Select objyear = new Select(year);

		objDay.selectByValue("20");
		objMonth.selectByIndex(8);
		objyear.selectByValue("1982");
		
	}
	void CheckFolowing(){
		driver.get("https://www.att.com/");
		driver.findElement(By.xpath("//div[@id='HEADBAND0']//following::li[2]//a")).click();
	}
	
	void iFrames(){
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.name("query")).sendKeys("Infosys");
		driver.findElement(By.name("query")).submit();
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XathComplex xObj=new XathComplex();
		//xObj.getURL="https://www.facebook.com/";
		//xObj.SimpleXpath(xObj.getURL);
		//xObj.iFrames();
		xObj.CheckFolowing();
	}

}
