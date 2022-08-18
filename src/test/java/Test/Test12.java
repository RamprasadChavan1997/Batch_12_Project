package Test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test12 {

	public static void main(String[] args) throws Exception {
		//ScreenShot by same name
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
        
        TakesScreenshot ts=(TakesScreenshot) driver;
        File scr=ts.getScreenshotAs(OutputType.FILE);
        File destn=new File(path+"\\Test1.png");
        FileUtils.copyFile(scr, destn);
        
        driver.close();
	}

}
