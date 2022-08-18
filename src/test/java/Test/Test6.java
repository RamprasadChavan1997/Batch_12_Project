package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//Dropdown handle by Selection Method
public class Test6 {

	public static void main(String[] args) throws Exception {
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://demo.guru99.com/test/newtours/register.php");
       driver.manage().window().maximize();
       
       WebElement drp_Country=driver.findElement(By.xpath("//select[@name='country']"));
       
       Select sel=new Select(drp_Country);
       System.out.println(sel.getFirstSelectedOption().getText());
       
      //SelectByIndex(index);
       sel.selectByIndex(7);     
       Thread.sleep(5000);
       
       //SelectByValue
       sel.selectByVisibleText("CHINA");
       Thread.sleep(4000);
       
       //SelectByText
       sel.selectByVisibleText("RUSSIA");
       Thread.sleep(6000);
       
       //Find list size
       List<WebElement> list=sel.getOptions();
       System.out.println(list.size());
       
       for(int i=0;i<list.size();i++)
       {
    	   String text=list.get(i).getText();
    	   System.out.println(text);
    	   if(text.equals("INDIA"))
    	   {
    		   sel.selectByVisibleText("INDIA");
    		   break;
    	   }
       }
       driver.close();
	}

}
