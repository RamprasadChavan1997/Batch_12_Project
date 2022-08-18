package TestNG;

import org.testng.annotations.Test;

public class Test_09 {
//Repeated test case execution
	@Test(invocationCount=3)
	public void A() {
		System.out.println("Test_A");
	}
	@Test
	public void B() {
		System.out.println("Test_B");
	}
}
