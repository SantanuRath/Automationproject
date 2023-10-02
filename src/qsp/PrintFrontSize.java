package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFrontSize {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    String text = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
	    String tex = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
	    System.out.println(text);
	    System.out.println(tex);
	    driver.close();
	}

}
