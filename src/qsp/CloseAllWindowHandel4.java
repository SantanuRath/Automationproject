package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWindowHandel4 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
	    String ptitle = driver.getTitle();
	    System.out.println(ptitle);
	    Set<String> allwh = driver.getWindowHandles();
	        for(String wh:allwh) {
			driver.switchTo().window(wh);
			  String title = driver.getTitle();
			if(title.equals(ptitle)) {
				
			}
			else {
				driver.close();
			}
			}
	}

}
