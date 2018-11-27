package com.apps.testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorByCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saidinesh/eclipse-workspace/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//String cssSelector = "input[@id= 'email']"
		WebElement Email = driver.findElement(By.cssSelector("input[id='email']")); // by css selector 
		Email.sendKeys("zsdfjkfjakfa");
	}

}
