package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws Exception {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
     
     //Identify the WebElement----->Locators---->Id
     WebElement txt_email=driver.findElement(By.id("email"));
     txt_email.sendKeys("8888913419");
     
    WebElement txt_password=driver.findElement(By.id("pass"));
    txt_password.sendKeys("123456789");
    
    //Identify the WebElement----->Locators---->Name
     WebElement btn_login=driver.findElement(By.name("login"));
     btn_login.click();
     
   
     String title=driver.getTitle();
     System.out.println(title);
     
     Thread.sleep(5000);
     driver.close();
     
    	}

}
