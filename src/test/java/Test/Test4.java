package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://www.facebook.com/login/");
      driver.manage().window().maximize();
      
      
     WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
     username.sendKeys("Ram@12345");
     
     WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
     password.sendKeys("1234567");
     
     WebElement login=driver.findElement(By.xpath("//button[contains(@id,'loginbutton')]"));
     login.click();
     
     WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
     forgot.click();
      
     
    driver.close(); 
     
     
     
	}

}
