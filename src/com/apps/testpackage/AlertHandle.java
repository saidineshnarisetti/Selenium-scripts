package com.apps.testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saidinesh/eclipse-workspace/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://apps-stage.juniper.net/feature-explorer/"); // passing url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement alert = driver.findElement(By.xpath("/html/body/div[1]/social-widget/div/a[4]")); // by partial link text
		alert.click();
		
		String alerttittle = driver.switchTo().alert().getText();
		System.out.println("ALERT: " +alerttittle);
		String expopt = "You are redirecting outside juniper.net. Do you want to continue?";
		
		if (alerttittle.equals(expopt)) {
			driver.switchTo().alert().accept();
			System.out.println("Redirecting to External page .");
		} else {
			System.out.println("  Satyed in feature explorer" +alerttittle);
		}

	}

}
