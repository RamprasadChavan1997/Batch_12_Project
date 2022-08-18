package Test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_17_1 {
    //Account Opening & login in Guru99 website method1
	public static void main(String[] args) throws Exception {
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://demo.guru99.com/test/newtours/register.php");
       driver.manage().window().maximize();
       
       String path="C:\\Users\\Dell\\eclipse-workspace\\Batch12_Project\\TestData\\Guru99.xlsx";
       FileInputStream fis=new FileInputStream(path);
       XSSFWorkbook wb=new XSSFWorkbook(fis);
       String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
       System.out.println(data_1);
       
       WebElement First_Name=driver.findElement(By.xpath("//input[@name='firstName']"));
       First_Name.sendKeys(data_1);
       
       String data_2=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
       System.out.println(data_2);
       WebElement Last_Name=driver.findElement(By.xpath("//input[@name='lastName']"));
       Last_Name.sendKeys(data_2);
       
       String data_3=wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
       System.out.println(data_3);
       WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
       phone.sendKeys(data_3);
       
       String data_4=wb.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
       System.out.println(data_4);
       WebElement email=driver.findElement(By.xpath("//input[@id='userName']"));
       email.sendKeys(data_4);
       
       String data_5=wb.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
       System.out.println(data_5);
       WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
       address.sendKeys(data_5);
       
       String data_6=wb.getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue();
       System.out.println(data_6);
       WebElement City=driver.findElement(By.xpath("//input[@name='city']"));
       City.sendKeys(data_6);
       
       String data_7=wb.getSheet("Sheet1").getRow(6).getCell(0).getStringCellValue();
       System.out.println(data_7);
       WebElement State=driver.findElement(By.xpath("//input[@name='state']"));
       State.sendKeys(data_7);
       
       String data_8=wb.getSheet("Sheet1").getRow(7).getCell(0).getStringCellValue();
       System.out.println(data_8);
       WebElement Postal_code=driver.findElement(By.xpath("//input[@name='postalCode']"));
       Postal_code.sendKeys(data_8);
       
       WebElement Country=driver.findElement(By.xpath("//select[@name='country']"));
       Select sel=new Select(Country);
       sel.selectByVisibleText("INDIA"); 
       
       String data_9=wb.getSheet("Sheet1").getRow(9).getCell(0).getStringCellValue();
       System.out.println(data_9);
       WebElement user_name=driver.findElement(By.xpath("//input[@id='email']"));
       user_name.sendKeys(data_9);
       
       String data_10=wb.getSheet("Sheet1").getRow(10).getCell(0).getStringCellValue();
       System.out.println(data_10);
       WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
       Password.sendKeys(data_10);
       
       String data_11=wb.getSheet("Sheet1").getRow(10).getCell(0).getStringCellValue();
       System.out.println(data_11);
       WebElement Confirm_Password=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
       Confirm_Password.sendKeys(data_11);
     
       WebElement Submit=driver.findElement(By.xpath("//input[@name='submit']"));
       Submit.click();
       
       String path1="C:\\Users\\Dell\\eclipse-workspace\\Batch12_Project\\ScreenShot1";
       
       String rm=RandomString.make(5);
       
       TakesScreenshot ts=(TakesScreenshot) driver;
       File scr=ts.getScreenshotAs(OutputType.FILE);
       File destn=new File(path1+"\\"+rm+".png");
       FileUtils.copyFile(scr, destn);
       
       WebElement Sign_in=driver.findElement(By.xpath("//a[@href='login.php']"));
       Sign_in.click();
       
       driver.get("https://demo.guru99.com/test/newtours/login.php");
       
       Thread.sleep(2000);
       String data_12=wb.getSheet("Sheet1").getRow(9).getCell(0).getStringCellValue();
       System.out.println(data_12);
       WebElement user=driver.findElement(By.xpath("//input[@name='userName']"));
       user.click();
       user.sendKeys(data_12);
       
       String data_13=wb.getSheet("Sheet1").getRow(10).getCell(0).getStringCellValue();
       System.out.println(data_13);
       WebElement Password1=driver.findElement(By.xpath("//input[@name='password']"));
       Password1.sendKeys(data_13);
       
       WebElement Submit1=driver.findElement(By.xpath("//input[@name='submit']"));
       Submit1.click();
       
        String rm1=RandomString.make(5);
       
       TakesScreenshot ts1=(TakesScreenshot) driver;
       File scr1=ts1.getScreenshotAs(OutputType.FILE);
       File destn1=new File(path1+"\\"+rm1+".png");
       FileUtils.copyFile(scr1, destn1);
       
       Thread.sleep(3000);
       driver.close();
	}

}
