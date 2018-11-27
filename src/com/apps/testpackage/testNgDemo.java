package com.apps.testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	void display() {
		Reporter.log("This is demo method for testNG",true);
		}

}
