package TestNG;

import org.testng.annotations.Test;

public class Test_08 {
//Test case execution enable
	@Test(enabled=false)
	public void A() {
		System.out.println("Test_A");
	}
	
	@Test
	public void B() {
		System.out.println("Test_B");
	}
	@Test
	public void C() {
		System.out.println("Test_C");
	}
	
}
