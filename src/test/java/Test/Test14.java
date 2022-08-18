package Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test14 {

public static String timestamp() {
	
	return new SimpleDateFormat("yyyy-mm-dd HH.mm.ss").format(new Date(0));
}
	public static void main(String[] args) throws Exception {
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/login/");
       driver.manage().window().maximize();
       
       WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
       email.sendKeys("ramprasadchavan01@gmail.com");
       
       WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
       password.sendKeys("Ram@123");
       
       WebElement login=driver.findElement(By.xpath("//button[@value='1']"));
       login.click();
       
       String path="C:\\Users\\Dell\\eclipse-workspace\\Batch12_Project\\ScreenShot1";
       
       String rm=RandomString.make(5);
       TakesScreenshot ts=(TakesScreenshot) driver;
       File src=ts.getScreenshotAs(OutputType.FILE);
       File dest=new File(path+"\\"+rm+" "+timestamp()+".png");
       FileUtils.copyFile(src,dest);
       driver.close();     
     }
}