package Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test91 {
@Test
public void Testfb() throws Exception
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
	WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	email.sendKeys("ram@123");
	
	WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("12345678");
	
	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	login.click();
	
	Thread.sleep(5000);
	driver.close();
	
}
}
