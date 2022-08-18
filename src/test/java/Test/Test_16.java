package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_16 {
     //Pop up alert handling 
	public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        
        WebElement custid=driver.findElement(By.xpath("//input[@name='cusid']"));
        custid.sendKeys("123456");
        WebElement btn_submit=driver.findElement(By.xpath("//input[@type='submit']"));
        btn_submit.click();
        
        Alert alt=driver.switchTo().alert();
        String text=alt.getText();
        System.out.println(text);//Do you really want to delete this Customer?
        //for accept
        alt.accept();
        
        //for reject
        //alt.dismiss();
        Thread.sleep(3000);
        
        String text_1=alt.getText();
        System.out.println(text_1);
        alt.accept();
      
        driver.close(); 
        }

}
