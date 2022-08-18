package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10 {


private static void draganddrop(WebDriver driver, WebElement src, WebElement dest) {
Actions act=new Actions(driver);
act.dragAndDrop(src, dest).build().perform();
}


	public static void main(String[] args) throws Exception {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.guru99.com/test/drag_drop.html");
     driver.manage().window().maximize();
     
     WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
     WebElement dest1=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
     draganddrop(driver,src1,dest1);
     
     WebElement src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
     WebElement dest2=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
     draganddrop(driver,src2,dest2);
     
     WebElement src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
     WebElement dest3=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
     draganddrop(driver,src3,dest3);
     
     WebElement src4=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
     WebElement dest4=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
     draganddrop(driver,src4,dest4);
     
     Thread.sleep(5000);
     driver.quit();
	
	}
}
