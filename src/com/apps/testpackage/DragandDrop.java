package com.apps.testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub Test git commit changes
		System.setProperty("webdriver.chrome.driver", "/Users/saidinesh/eclipse-workspace/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html"); // passing url
		
		WebElement block1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement column = driver.findElement(By.id("column-2"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(block1, column).perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
