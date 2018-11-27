package com.apps.testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByAbslouteXpath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saidinesh/eclipse-workspace/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//String absloutepath ="//*[@id=\"email\"]";
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]")); // by partial link text
		Email.sendKeys("zsdfjkfjakfa");
		
		WebElement text= driver.findElement(By.xpath("//div[contains(text(),'Facebook helps you')]"));
		System.out.println(text.getText());
		
		//xpath groups and indexes 
		WebElement surname= driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
		surname.sendKeys("zsdfjkfjakfa");
	}
}
