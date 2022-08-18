package Test;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_15_2 {
      //For Entering String data
	public static void main(String[] args) throws Exception {
		//Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		//Identify the WebElement
		WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		
		
       String path="C:\\Users\\Dell\\eclipse-workspace\\Batch12_Project\\TestData\\Ramdata.xlsx";
       FileInputStream fis=new FileInputStream(path);
       XSSFWorkbook wb=new XSSFWorkbook(fis);
       String data_1=wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
       System.out.println(data_1);
       
       String data_2=wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
       System.out.println(data_2);
      
       email.sendKeys(data_1);
       password.sendKeys(data_2);
       login.click();
       
       Thread.sleep(5000);
       driver.close();
	}

}
