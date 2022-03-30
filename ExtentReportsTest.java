package reports;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsTest {
ExtentHtmlReporter htmlReporter;
ExtentTest logger;
ExtentReports report;
public String strUserName;
public String strPassword;
String getURL="";
WebDriver driver;
@Test
public void DriverSettings(){

System.setProperty("webdriver.chrome.driver",
"D:\\selenium\\browsers\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
driver.manage().window().maximize();

String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());

// file name with extension
htmlReporter = new ExtentHtmlReporter("D:\\selenium\\reports"
+ "\\TestAlert"+timeStamp+".html");
//htmlReporter = new ExtentHtmlReporter("D:\\selenium\\reportsTestAlert.html");
report = new ExtentReports();
report.attachReporter(htmlReporter);
}
@Test(priority=1)
public void testalert()
{
String expMsg = "Test Message";
String a="";
String b="";
String text="";
logger = report.createTest("Basic popup testing");

driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
logger.log(Status.PASS, "Navigated to website");
driver.findElement(By.id("login1")).sendKeys("U");
driver.findElement(By.id("password")).sendKeys("");

driver.findElement(By.name("proceed")).click();

Alert objAlert= driver.switchTo().alert();
logger.log(Status.PASS, "Alert Generated successfully");

text =objAlert.getText();
 objAlert.dismiss();
 driver.switchTo().defaultContent();
 
 logger.log(Status.INFO, "Alert dismissed successfully");


 if(expMsg.equals(text))
 {
 logger.log(Status.PASS, "ALert text message displayed successfully");
 }
 else
 {
 logger.log(Status.FAIL, "Alert message "+text + " mismatch.");
 }
 
 logger = report.createTest("Second test case");
 logger.log(Status.PASS, "Sample test case pass");
 
report.flush();  
}
/*
public static void main(String[] args) {
// TODO Auto-generated method stub

ExtentReportsTest objERT= new ExtentReportsTest();
objERT.DriverSettings();
objERT.testalert();

}*/

}
