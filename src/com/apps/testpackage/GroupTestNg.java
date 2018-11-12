package com.apps.testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTestNg {
	public class ActiTimescripts {
		@Test (priority=1)
		public void createUser() {
			Reporter.log("User created sucessfully ",true);
		} 
		@Test (invocationCount=5,priority=2,dependsOnMethods= {"createUser"})
		public void editUser() {
			Reporter.log("User details has been edited sucessfully",true);
		}
		@Test(priority=8,dependsOnMethods= {"editUser"})
		public void deleteUser() {
			Reporter.log("User has been deleated",true);
		}
		@Test (priority=3)
		public void CraeateTask() {
			Reporter.log("Task created sucessfully",true);
		}
		@Test (priority=0)
		public void Logtime() {
			Reporter.log("Logging time sheet is compleated",true);
		}
	}
	
}
