package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_010 {
//Test case execution depends on another test case
	@Test
	public void A() {
		System.out.println("Test_A");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="A")
	public void B() {
		System.out.println("Test_B");
	}
	@Test
	public void C() {
		System.out.println("Test_C");
	}
}
