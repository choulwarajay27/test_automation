package alerts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class alert1 {
	ExtentHtmlReporter htmlReporter;
	ExtentTest logger;
	ExtentReports report;
	WebDriver driver;
	@Test(priority=1)
	void driversetting(){
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());

		// file name with extension
		htmlReporter = new ExtentHtmlReporter("D:\\selenium\\reports"
		+ "\\TestAlert1"+timeStamp+".html");
		//htmlReporter = new ExtentHtmlReporter("D:\\selenium\\reportsTestAlert.html");
		report = new ExtentReports();
		report.attachReporter(htmlReporter);

	}
	@Test(priority=2)
	void alert2(){
		logger = report.createTest("Basic popup testing");
		driver.get("https://www.facebook.com/");
		logger.log(Status.PASS, "Navigated to website");	
		report.flush();  
	}

}
