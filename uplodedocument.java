package uplodedoc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uplodedocument {
	WebDriver driver;
	void driver1(){
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
		driver.manage().window().maximize();

	}
	void newclass(){
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		try{
			Runtime.getRuntime().exec("D:\\selenium\\autoit\\uploadfile.exe");
		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@id='processTask']")).click();
		
	}
	
	public static void main(String[] args){
		uplodedocument obj = new uplodedocument();
		obj.driver1();
		obj.newclass();			
	}

}
