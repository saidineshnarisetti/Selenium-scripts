package com.apps.testpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class Phantom {
	@Test
	public void main(String[] args) {
		
		
		System.setProperty("phantomjs.binary.path", "/Users/saidinesh/eclipse-workspace/Drivers/phantomjs");
	
		PhantomJSDriver driver =new PhantomJSDriver();
		driver.get("http://www.google.co.in");
		System.out.println("Tittle of this page :" + driver.getTitle());
		
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Edureka");
		element.sendKeys(Keys.ENTER);
		
		System.out.println("I am at " +driver.getTitle());
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(file, new File("/Users/saidinesh/Documents/Screenshots/screenshotselenium.jpg"));
		} catch (IOException e) {
		e.printStackTrace();
		}
		
		driver.quit();
	}
}
