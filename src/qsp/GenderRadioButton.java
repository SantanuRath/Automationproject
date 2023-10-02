package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderRadioButton {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		int y1 = driver.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
		System.out.println(y1);
		int y2 = driver.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
		System.out.println(y2);
		int y3 = driver.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
		System.out.println(y3);
		if(y1==y2 && y2==y3 && y1==y3)
		{
			System.out.println("Gender radio buttons are properly aligned and pass");	
		}
		else 
		{
			System.out.println("Gender radio buttons are not properly aligned and fail");
		}
		driver.close();
	}

}
