package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8 {
   //Action
	public static void main(String[] args) throws Exception {
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://demo.guru99.com/test/simple_context_menu.html");
       driver.manage().window().maximize();
       
       //WebElement selenium=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));	 
       Actions act=new Actions(driver);
       //act.moveToElement(selenium).click(selenium).build().perform();
       //Thread.sleep(5000);
       
      // WebElement Right_Click_me=driver.findElement(By.xpath("//span[text()='right click me']"));
       //act.contextClick(Right_Click_me).build().perform();
       //Thread.sleep(5000);
       
       WebElement Double_Click_me_TO_see_Alert=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
       act.doubleClick(Double_Click_me_TO_see_Alert).build().perform();
       
       
       Thread.sleep(5000);
       driver.close();
      
    		   
	}

}
