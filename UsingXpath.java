package SeleniumTest;

import org.openqa.selenium.By;

public class UsingXpath extends DriverSettings{

	public void xPathbyID(String url){
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("6587985211");
		//driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("UMESH");
		
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input"))
		.sendKeys(" SAME NAME");
		driver.findElement(By.xpath("//p[@id='signin_info']/a[2]")).click();
	}
	
	public void xPathbyStartWith(String url){
		driver.get(url);
		
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("UMESH");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingXpath uobj=new UsingXpath();
		uobj.getURL="http://register.rediff.com/register/register.php?FormName=user_details";
		uobj.xPathbyID(uobj.getURL);
	}

}
