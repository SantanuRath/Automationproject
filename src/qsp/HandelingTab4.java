package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingTab4 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Thread.sleep(7000);
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			if(!(wh.equals(pwh))) {
				driver.switchTo().window(wh);}
	}
		Thread.sleep(6000);
	    String text1 = driver.findElement(By.xpath("//span[text()='Features']")).getText();
	    String text2 = driver.findElement(By.xpath("//span[text()='Clients']")).getText();
	    String text3 = driver.findElement(By.xpath("//span[text()='Help Center']")).getText();
	    String text4 = driver.findElement(By.xpath("//span[text()='Resources']")).getText();
	    String text5 = driver.findElement(By.linkText("Pricing")).getText();
	    System.out.println(text1);
	    System.out.println(text2);
	    System.out.println(text3);
	    System.out.println(text4);
	    System.out.println(text5);
	    driver.close();
	    driver.switchTo().window(pwh);
	    driver.close();
}
}
