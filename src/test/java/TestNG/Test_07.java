package TestNG;

import org.testng.annotations.Test;

public class Test_07 {
	//Test case execution by Priority
@Test(priority=2)
public void A() {
	System.out.println("Test_A");
}

@Test(priority=3)
public void B() {
	System.out.println("Test_B");
}
@Test(priority=1)
public void C() {
	System.out.println("Test_C");
}
@Test(priority=0)
public void D() {
	System.out.println("Test_D");
}
@Test(priority=-5)
public void E() {
	System.out.println("Test_E");
}
}
