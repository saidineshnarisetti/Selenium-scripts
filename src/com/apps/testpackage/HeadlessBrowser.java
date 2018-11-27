package com.apps.testpackage;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadlessBrowser {
	
	@Test
	public void htmlUnitDriver() throws Exception{
		System.setProperty("webdriver.chrome.driver", "/Users/saidinesh/eclipse-workspace/Drivers/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver =new ChromeDriver(options);
		driver.get("http://www.google.co.in");
		System.out.println("Tittle of this page :" + driver.getTitle());
		
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Juniper Networks -- feature Explorer");
		element.sendKeys(Keys.ENTER);
		
		System.out.println("I am at " +driver.getTitle());
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("/Users/saidinesh/Documents/Screenshots/screenshotselenium.jpg"));
		
		driver.quit();
		
	}
}