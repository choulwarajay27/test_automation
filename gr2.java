package TestNGgroup;

import org.testng.annotations.Test;

public class gr2 {
	@Test(priority =2, groups={"Moneytransfer"})
	public void login()
	{
		System.out.println("Money Transfered Successfully.. ");
	}
	@Test (priority =1, groups={"statement"})
	public void login1()
	{
		System.out.println("Statement for the period generated successfully. ");
	}
	
	@Test (priority =3, groups={"Moneytransfer","login"})
	public void login2()
	{
		System.out.println("Money Transfered Successfully.. Statement Generated");
	}
	@Test (priority =0, groups={"login"})
	public void login4()
	{
		System.out.println("Login Successful. Money Transfered Failed.. ");
	}

}
