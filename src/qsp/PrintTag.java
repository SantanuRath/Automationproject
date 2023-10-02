package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTag {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String text=driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		String text1=driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
		System.out.println(text);
		System.out.println(text1);
		driver.close();
		
	}

}
