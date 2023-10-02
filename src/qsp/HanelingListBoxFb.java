package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HanelingListBoxFb {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		WebElement daylistbox = driver.findElement(By.id("day"));
		Select d=new Select(daylistbox);
		d.selectByValue("7");
		WebElement monthlistbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select m=new Select(monthlistbox);
		m.selectByVisibleText("Jul");
		WebElement yearlistbox = driver.findElement(By.id("year"));
		Select y=new Select(yearlistbox);
		y.selectByValue("1993");
	}

}
