package com.actime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwdbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setlogin(String un,String pw) {
		untbx.sendKeys("admin");
		pwdbx.sendKeys("manager");
		lgbtn.click();
	}
}
