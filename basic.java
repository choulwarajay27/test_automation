package TestNGbasic;

import org.testng.annotations.Test;

public class basic {
	@Test(priority = -1)
	void test()
	{
		System.out.println("jbsfhsd");
	}
	@Test
	void Atest1(){
		System.out.println("prshank");
	}
	@Test(priority = -2)
	void Atest(){
		System.out.println("prshank1");
	}
}
