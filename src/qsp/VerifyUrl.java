package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(4000);
		String expectedurl=("https://selenium.dev/");
		String actualurl=driver.getCurrentUrl();
		if(actualurl.equals(expectedurl))
		{
			System.out.println("Url is successfully navigating and pass");
		}
		else {
			System.out.println("Url is successfully navigating and fail");
		}
	    driver.close();
	}
}

