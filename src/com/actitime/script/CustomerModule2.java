package com.actitime.script;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule2 {
@BeforeClass
public void OpenBrowser() {
	Reporter.log("openbrowser",true);
}
@AfterClass
public void CloseBrowser() {
	Reporter.log("closebrowser",true);
}
@BeforeMethod
public void Login() {
	Reporter.log("login",true);
}
@AfterMethod
public void Logout() {
	Reporter.log("logout",true);
}
@Test(priority=1,invocationCount=2)
public void EditCustomer() {
	Reporter.log("editcustomer",true);
}
@Test
public void RegisterCustomer() {
	Reporter.log("registercustomer",true);
}
@Test
public void DeleteCustomer() {
	Reporter.log("deletecustomer",true);
}
}
