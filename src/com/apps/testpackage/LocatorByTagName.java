package com.apps.testpackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saidinesh/eclipse-workspace/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List <WebElement> allLikns = driver.findElements(By.tagName("a"));  // by link text
		int linkCount =allLikns.size();
		System.out.println(linkCount);
		for (WebElement Link:allLikns) {
			String text = Link.getText();
			System.out.println(text);
		}
		

	}

}
