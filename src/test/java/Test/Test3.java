package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) throws Exception {
         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         
         driver.get("https://www.facebook.com/login/");
         driver.manage().window().maximize();
         
         //X-path by attribute "id"
         WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
         txt_email.sendKeys("8888913419");
         
         //X-path by attribute "name"
         WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
         txt_password.sendKeys("12345678");
         Thread.sleep(5000);
         
         WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
         btn_login.click();
         
         Thread.sleep(10000);
         driver.close();
         
	}

}
