package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_18 {

	public static void main(String[] args) throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/popup.php");
    driver.manage().window().maximize();
    
    String parentwindowadd=driver.getWindowHandle();
    System.out.println(parentwindowadd);
    
    driver.findElement(By.xpath("//a[@target='_blank']")).click();
    Set<String> Alladdress=driver.getWindowHandles();
    System.out.println(Alladdress);
    Iterator<String> it=Alladdress.iterator();
    while(it.hasNext())
    {
    	String childwindowadd=it.next();
    	if(!parentwindowadd.equals(childwindowadd))
    	{
    		driver.switchTo().window(childwindowadd);
    		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("ram@gmail.com");
         	
    	}
    }
         WebElement submit=driver.findElement(By.xpath("//input[@name='btnLogin']"));
         submit.click();
         driver.close();
         
         Thread.sleep(5000);  	
         driver.switchTo().window(parentwindowadd);
		 driver.close();
		
		
	}

}
