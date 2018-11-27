package com.apps.testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByPartiallinkText {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", "/Users/saidinesh/eclipse-workspace/Drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				WebElement Forgotten = driver.findElement(By.partialLinkText("Create")); // by partial link text
				Forgotten.click();

	}

}
