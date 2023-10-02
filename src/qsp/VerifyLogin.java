package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		boolean login=driver.findElement(By.name("login")).isEnabled();
		if(login=true)
		{
			System.out.println("login is enabled");
		}
		else 
		{
			System.out.println("login is not enabled");
		}
		driver.close();
		
	}

}
