package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelingDragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement destn = driver.findElement(By.xpath("//h1[text()='Block 3']"));
	Actions a=new Actions(driver);
	a.dragAndDrop(src, destn).perform();
	}

}
