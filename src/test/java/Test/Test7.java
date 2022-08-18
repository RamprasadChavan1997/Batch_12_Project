package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//Dropdown Handle by using method
public class Test7 {
	private static void dropdown(WebElement ram, String text)
	{
		Select ab=new Select(ram);
		ab.selectByVisibleText(text);
		
	}

	public static void main(String[] args) throws Exception {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://demo.guru99.com/test/newtours/register.php");
      driver.manage().window().maximize();
      
      WebElement Ram=driver.findElement(By.xpath("//select[@name='country']"));
      Thread.sleep(5000);
      
      dropdown(Ram,"INDIA");
      Thread.sleep(5000);
      
      dropdown(Ram,"CHINA");
      Thread.sleep(5000);
      
      System.out.println(driver.getTitle());
      driver.close();
	}
}
