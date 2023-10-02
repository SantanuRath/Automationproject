package com.actitime.script;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.demoactitime.generic.BaseClass;
public class CustomerModule extends BaseClass{
@Test
public void CreateCustomer() {
	Reporter.log("CreateCustomer",true);
}
}
