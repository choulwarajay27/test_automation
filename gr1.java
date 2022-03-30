package TestNGgroup;

import org.testng.annotations.Test;

public class gr1 {
	@Test  
	public void WebLoginCarLoan()  
	{  
		System.out.println("Web Login Car Loan");  
	}  
	@Test(groups= {"Moneytransfer"}) 
	public void MobileLoginCarLoan()  
	{  
		System.out.println("Mobile Login Car Loan");  
	}  
	@Test(groups="Moneytransfer")
	void MoneyTransfer(){
		System.out.println("money Transfered Successully..");
	}
	@Test(groups= {"login"})  
	public void APILoginCarLoan()  
	{  
		System.out.println("API Login Car Loan");  
	}

}
