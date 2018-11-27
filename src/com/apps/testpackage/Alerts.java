package com.apps.testpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saidinesh/eclipse-workspace/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement button = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		button.click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		alert.sendKeys("saidinesh");
		String alerttittle = driver.switchTo().alert().getText();
		System.out.println("ALERT: " +alerttittle);
		
		
		

	}

}
