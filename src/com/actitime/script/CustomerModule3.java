package com.actitime.script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.demoactitime.generic.BaseClass;
@Listeners(com.demoactitime.generic.ListenerImplementation.class)
public class CustomerModule3 extends BaseClass {
@Test
public void CreateCustomer() {
	Reporter.log("CreateCustomer",true);
	Assert.fail();
}
}
