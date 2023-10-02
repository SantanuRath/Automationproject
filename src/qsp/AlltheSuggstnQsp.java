package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlltheSuggstnQsp {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspider");
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		int count=all.size();
		for(WebElement text:all)
		{
			String tex = text.getText();
			System.out.println(tex);
		}
		//all.get(count-1).click();
		driver.close();
	}

}
