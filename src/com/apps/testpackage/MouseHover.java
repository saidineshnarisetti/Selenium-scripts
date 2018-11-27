package com.apps.testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saidinesh/eclipse-workspace/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/"); // passing url

		Actions action = new Actions(driver);
		WebElement dept=driver.findElement(By.xpath("//*[@id=\"nav-link-shopall\"]/span[2]"));
		action.moveToElement(dept).perform();
		WebElement books=driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[15]/span"));
		action.moveToElement(books).perform();  //Textbooks
		WebElement testbook=driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[15]/div/a[7]/span"));
		action.moveToElement(testbook).perform(); 
		testbook.click();

	}

}
