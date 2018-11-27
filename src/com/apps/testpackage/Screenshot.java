package com.apps.testpackage;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {

public static void captureScreenMethod() throws Exception{
System.setProperty("webdriver.chrome.driver", "/Users/saidinesh/eclipse-workspace/Drivers/chromedriver");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotFile, new File("/Users/saidinesh/Documents/Screenshots/screenshotselenium.jpg"));
driver.close();
driver.quit(); 
}
}

