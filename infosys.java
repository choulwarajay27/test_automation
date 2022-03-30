package openbr;

import org.openqa.selenium.By;

public class infosys extends yahoo {
	
	void info(){
	   a.get("https://www.rediff.com/");
	   
	   a.switchTo().frame("moneyiframe");
	   a.findElement(By.id("query")).sendKeys("infosys");
	   a.findElement(By.name("query")).submit();
	}
	
	
	public static void main(String[] args){
	   infosys oj = new infosys();
	   oj.webd();
	   oj.info();
	   
		
	}

}
