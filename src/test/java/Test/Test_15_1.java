package Test;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_15_1 {
      //For Entering Numeric data by  creating Numeric method
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
       double data_1=wb.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
       System.out.println(data_1);
       
       double data_2=wb.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
       System.out.println(data_2);
   
       String data_1_s=String.valueOf(data_1);
       String data=data_1_s.replace(".0","");
      System.out.println(data);
      
      String data_2_s=String.valueOf(data_2);
      String data0=data_2_s.replace(".0","");
     System.out.println(data0);
     
     
       email.sendKeys(data);
       password.sendKeys(data0);
       login.click();
       
       driver.close();
       
	}

}

