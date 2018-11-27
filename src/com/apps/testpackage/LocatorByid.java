package com.apps.testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByid {

	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/saidinesh/eclipse-workspace/Drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement email = driver.findElement(By.id("email")); // locator id 
			email.sendKeys("dinu.narisetti@gmail.com");
					
	}

}
