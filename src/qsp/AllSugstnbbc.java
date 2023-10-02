package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllSugstnbbc {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/"); 
		Thread.sleep(2000);
		List<WebElement> allsugn = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../..//h3"));
		
		for(WebElement text:allsugn)
		{
			String p=text.getText();
			System.out.println(p);
		}
		driver.close();
	}

}
