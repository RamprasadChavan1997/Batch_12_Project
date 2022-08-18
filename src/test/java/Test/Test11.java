package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

	
	public static void main(String[] args) throws Exception {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/login/");
      driver.manage().window().maximize();
      Actions act=new Actions(driver);
      
      WebElement log_in=driver.findElement(By.xpath("//input[@name='email']"));
      act.keyDown(log_in, Keys.SHIFT).sendKeys("ramprasad").keyUp(Keys.SHIFT).build().perform();
      act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
      act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
      Thread.sleep(5000);
     
      WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
      password.click();
      Thread.sleep(3000);
      
      act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
      Thread.sleep(3000);
      
      WebElement click=driver.findElement(By.xpath("//button[@value='1']"));
      click.click();
      
      Thread.sleep(4000);
      driver.close();
	}

}