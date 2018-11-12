package com.apps.testpackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GlobalSearch  {
	@Test(priority = 8)
	public void verifySearch() throws InterruptedException {

		try {
			WebElement element = driver.findElement(By.id("advSearchTxt"));
			element.sendKeys("agentd\n");
			Reporter.log(driver.findElement(By.xpath("/html/body/div[4]/div")).getText());
			String actSearch = driver.getCurrentUrl();
			String expSearch = "https://apps-stage.juniper.net/telemetry-explorer/search?q=agentd";
			// driver.navigate().refresh();
			assertEquals(actSearch, expSearch);
			Reporter.log("Url matched");
			
			System.out.println(driver.findElement(By.id("acsMainInvite")).getSize());
			if(driver.findElement(By.id("acsMainInvite")).getSize()!=null) {
				System.out.println("in");
				element=driver.findElement(By.id("acsMainInvite"));
				if (element.isEnabled()) {
					//closefeedback();
					driver.findElement(By.xpath("//*[@id=\"acsMainInvite\"]/a")).click();
				}
			}
			
			driver.findElement(By.className("ke-search-link-desc")).click();
			Reporter.log("Successfully searched");
			Reporter.log(driver.findElement(By.xpath("//*[@id=\"swfixed_chosen\"]/a/span")).getText()); // by partial
																										// link text
			Reporter.log(driver.findElement(By.id("relfixed_chosen")).getText()); // by partial link text
			Reporter.log(driver.findElement(By.id("modulefixed_chosen")).getText()); // by partial link text
			Reporter.log(driver.findElement(By.id("telemetryTreeFilter")).getAttribute("value"));
			Reporter.log(driver.findElement(By.xpath("/html/body/div[4]/section[2]/section[1]/section[1]")).getText());
			String actSrch = driver.getCurrentUrl();
			String expSrch = "https://apps-stage.juniper.net/telemetry-explorer/?software=Junos%20OS&release=18.4R1&moduleId=296762&tagId=296762&tagName=agentd&srchStr=agentd";
			assertEquals(actSrch, expSrch);
			Reporter.log("Url matched");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.log("Alert present");
		}
	}

	private void closefeedback() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@id=\"acsMainInvite\"]/a")).click();
	}

	@Test(priority = 9)
	public void verifynegativeSearch() throws InterruptedException {
		try {
			WebElement element = driver.findElement(By.id("advSearchTxt"));
			element.sendKeys("subscribe-test\n");
			WebElement eq = driver.findElement(By.id("acsMainInvite"));
			if (eq.isEnabled()) {
				closefeedback();
			}
			Reporter.log(driver.findElement(By.xpath("/html/body/div[4]/div")).getText());
			Reporter.log(driver.findElement(By.className("noSrchRes")).getText());
			Reporter.log(driver.getCurrentUrl());
			driver.findElement(By.className("bckToHome")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.log("Alert present");
			// driver.findElement(By.id("acsMainInvite"));
			//WebElement eq = driver.findElement(By.id("acsMainInvite"));
			// eq.getTagName();
			// eq.getText();
			// eq.isEnabled();
			//System.out.println(eq.getTagName() + "-----" + eq.getText() + "-------" + eq.isEnabled());
			// System.out.println(driver.findElement(By.id("acsMainInvite")));
			// driver.findElement(By.xpath("//*[@id=\"acsMainInvite\"]/div/a[1]")).click();
			//driver.findElement(By.xpath("//*[@id=\"acsMainInvite\"]/a")).click();
		}
	}

}
