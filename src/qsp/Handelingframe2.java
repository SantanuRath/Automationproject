package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelingframe2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/java%20program/page1.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame("f1");
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("b");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c");
		WebElement e = driver.findElement(By.xpath("//iframe"));
		Thread.sleep(3000);
		driver.switchTo().frame(e);
		driver.findElement(By.id("t2")).sendKeys("d");
	}

}
