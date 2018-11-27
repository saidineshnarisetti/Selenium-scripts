package com.apps.testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByclassname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "/Users/saidinesh/eclipse-workspace/Drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				WebElement firstname = driver.findElement(By.className("inputtext _58mg _5dba _2ph-")); // identifying web element uniquely will not possible using class name locator 
				firstname.sendKeys("1234567890");

	}

}
