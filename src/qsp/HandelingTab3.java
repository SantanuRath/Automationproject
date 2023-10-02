package qsp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingTab3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	String pwh = driver.getWindowHandle();
	Set<String> wh1 = driver.getWindowHandles();
	Iterator<String> w = wh1.iterator();
	while(w.hasNext()) {
		String childtab=w.next();
		if(!pwh.equals(childtab)) {
			driver.switchTo().window(childtab);
			driver.close();
		}
	}
	driver.quit();
	}

}
