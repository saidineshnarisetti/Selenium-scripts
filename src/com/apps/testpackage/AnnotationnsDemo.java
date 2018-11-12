package com.apps.testpackage;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationnsDemo {
	
	@BeforeSuite
	public void beforeSuiteMethod(){
		Reporter	.log("This get executed before the execution ",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter	.log("This method get executed in testing.xml ",true);
	}
	@AfterSuite
	public void afterSuiteMethod(){
		Reporter	.log("This get executed after the execution ",true);
	}
	@AfterTest
	public void afterTestMethod() {
		Reporter	.log("This method get executed after every test block in testing.xml ",true);
	}
	@BeforeClass
	public void beforeClassMetohd(){
		Reporter	.log("This get executed before every class in your project",true);
	}
	@AfterClass
	public void afterClassMetohd(){
		Reporter	.log("This get executed after every class in your project",true);
	}
	@BeforeMethod
	public void beforeMetohd(){
		Reporter	.log("This get executed before every test method in class",true);
	}
	@AfterMethod
	public void afterMetohd(){
		Reporter	.log("This get executed after every test method in class",true);
	}
	@Test
	public void testMetohd(){
		Reporter	.log("This is main script to be executed",true);
	}


}
