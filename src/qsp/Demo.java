package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://beta.queuebuster.co/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user")).sendKeys("8005054500");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@class='btn login-btn' and text()='Login']")).click();
		driver.findElement(By.xpath("//button[@id='Popover1']//img")).click();
		driver.findElement(By.xpath("//div[@class='popper-card-child' and text()='Sign Out']")).click();
//     	String title=driver.getTitle();
//		System.out.println(title);
		driver.close();
	}

}
