package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_05 extends BaseTest {
@Test
public void email() {
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("Ram@123");
}
@Test
public void password() {
	WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("12345678");
	
}

}
