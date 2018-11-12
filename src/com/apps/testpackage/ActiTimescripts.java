package com.apps.testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActiTimescripts {
	@Test (priority =1)
	//Test changes 
	public void createUser() {
		Reporter.log("User created sucessfully ",true);
	} 
	@Test (priority =3)
	public void editUser() {
		Reporter.log("User details has been edited sucessfully",true);
	}
	@Test (priority =4)
	public void teleteUser() {
		Reporter.log("User has been deleated",true);
	}
	@Test (invocationCount =10,priority =2)
	public void CraeateTask() {
		Reporter.log("Task created sucessfully",true);
	}

}
