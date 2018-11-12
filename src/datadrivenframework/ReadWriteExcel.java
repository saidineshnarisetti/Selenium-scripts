package datadrivenframework;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadWriteExcel {
	WebDriver driver;
	WebDriverWait wait;
	//Workbook workbook;
	//Sheet sheet;
	//Cell cell;

 @BeforeTest
 public void TestSetup()
 	{
	 System.setProperty("webdriver.gecko.driver","/Users/saidinesh/eclipse-workspace/Drivers/geckodriver");
	driver = new FirefoxDriver();
	
	driver.get("https://www.edureka.co/");
	driver.manage().window().maximize();
	
	wait = new WebDriverWait(driver,30);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement Login = driver.findElement(By.partialLinkText("Log ")); // by partial link text
	Login.click();
	}
@Test
public void ReadData() throws IOException
	{
	 // Import excel sheet.
	 File src=new File("/Users/saidinesh/workspace/JavaProject/Inputdata/TestData.xlsx");
	 
	 // Load the file.
	 FileInputStream finput = new FileInputStream(src);
	 
	 // Load the workbook.
	Workbook workbook = new XSSFWorkbook(finput);
	 
    // Load the sheet in which data is stored.
	 Sheet sheet= workbook.getSheetAt(0);
	 
	 for(int i=1; i<=sheet.getLastRowNum(); i++)
	 {
		 // Import data for Email.
		 Cell cell = sheet.getRow(i).getCell(1);
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 
		 driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys(cell.getStringCellValue());
		 
		 // Import data for password.
		 cell = sheet.getRow(i).getCell(2);
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 driver.findElement(By.xpath("//*[@id=\"pwd1\"]")).sendKeys(cell.getStringCellValue());
		 WebElement Login_buttonn = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div[4]/button")); // by partial link text
		 Login_buttonn.click();
	    	workbook.close();
	 }
} 
 
 
}
