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

public class Test_17_2 {
      //Guru99 account opening & login by Automation method 2
	public static void main(String[] args) throws Exception {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.guru99.com/test/newtours/register.php");
     driver.manage().window().maximize();
     
     WebElement first_name=driver.findElement(By.xpath("//input[@name='firstName']"));
     WebElement last_name=driver.findElement(By.xpath("//input[@name='lastName']"));
     WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
     WebElement email=driver.findElement(By.xpath("//input[@id='userName']"));
     WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
     WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
     WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
     WebElement postalcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
     WebElement Country=driver.findElement(By.xpath("//select[@name='country']"));
     WebElement user_name=driver.findElement(By.xpath("//input[@id='email']"));
     WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
     WebElement confirm_password=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
     WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
     
     String path="C:\\Users\\Dell\\eclipse-workspace\\Batch12_Project\\TestData\\Guru99.xlsx";
     FileInputStream fis=new FileInputStream(path);
     XSSFWorkbook wb=new XSSFWorkbook(fis);
     
     String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
     System.out.println(data_1);
     String data_2=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
     System.out.println(data_2);
     String data_3=wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
     System.out.println(data_3);
     String data_4=wb.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
     System.out.println(data_4);
     String data_5=wb.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
     System.out.println(data_5);
     String data_6=wb.getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue();
     System.out.println(data_6);
     String data_7=wb.getSheet("Sheet1").getRow(6).getCell(0).getStringCellValue();
     System.out.println(data_7);
     String data_8=wb.getSheet("Sheet1").getRow(7).getCell(0).getStringCellValue();
     System.out.println(data_8);
     Select sel=new Select(Country);
     sel.selectByVisibleText("INDIA");    
     String data_10=wb.getSheet("Sheet1").getRow(9).getCell(0).getStringCellValue();
     System.out.println(data_10);
     String data_11=wb.getSheet("Sheet1").getRow(10).getCell(0).getStringCellValue();
     System.out.println(data_11);
     String data_12=wb.getSheet("Sheet1").getRow(11).getCell(0).getStringCellValue();
     System.out.println(data_12);
     
     first_name.sendKeys(data_1);
     last_name.sendKeys(data_2);
     phone.sendKeys(data_3);
     email.sendKeys(data_4);
     address.sendKeys(data_5);
     city.sendKeys(data_6);
     state.sendKeys(data_7);
     postalcode.sendKeys(data_8);
    
     user_name.sendKeys(data_10);
     password.sendKeys(data_11);
     confirm_password.sendKeys(data_12);
     submit.click();
     
     String path1="C:\\Users\\Dell\\eclipse-workspace\\Batch12_Project\\ScreenShot1";
     String rm=RandomString.make(5);
     TakesScreenshot ts=(TakesScreenshot) driver;
     File src=ts.getScreenshotAs(OutputType.FILE);
     File destn=new File(path1+"\\"+rm+".png");
     FileUtils.copyFile(src, destn);
     
     WebElement signin=driver.findElement(By.xpath("//a[@href='login.php']"));
     signin.click();
     
     driver.get("https://demo.guru99.com/test/newtours/login.php");
    
     
     WebElement username=driver.findElement(By.xpath("//input[@name='userName']"));
     String data_13=wb.getSheet("Sheet1").getRow(10).getCell(0).getStringCellValue();
     System.out.println(data_13);
     username.sendKeys(data_13);
     
     WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
     String data_14=wb.getSheet("Sheet1").getRow(11).getCell(0).getStringCellValue();
     System.out.println(data_14);
     password1.sendKeys(data_14);
     
     WebElement submit1=driver.findElement(By.xpath("//input[@name='submit']"));
     submit1.click();
    
     String rm1=RandomString.make(4);
     TakesScreenshot ts1=(TakesScreenshot) driver;
     File src1=ts1.getScreenshotAs(OutputType.FILE);
     File destn1=new File(path1+"\\"+rm1+".png");
     FileUtils.copyFile(src1, destn1);
     
     Thread.sleep(5000);
     driver.close();
	}

}
