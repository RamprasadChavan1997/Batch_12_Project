package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
	public static void main(String[] args) throws Exception 
	{
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
       String title=driver.getTitle();
       System.out.println(title);
       
       String url=driver.getCurrentUrl();
       System.out.println(url);
             
       driver.navigate().to("https://mvnrepository.com/");
       Thread.sleep(5000); //5 sec
       driver.navigate().back();
       Thread.sleep(5000); //5 sec
       driver.navigate().forward();
       Thread.sleep(5000);  //5 sec
       driver.navigate().refresh();
       driver.close();       
	}

}
