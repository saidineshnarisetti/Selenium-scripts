package com.apps.testpackage;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class FirstTestngClass {
	
	@Test
	void display() {
	Reporter.log("This is test method");
	}

}
