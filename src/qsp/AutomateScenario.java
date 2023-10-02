package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateScenario {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		Actions a=new Actions(driver);
		a.moveToElement(electronics).perform();
		WebElement camera = driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
		a.moveToElement(camera).perform();
		driver.findElement(By.xpath("//a[text()='DSLR & Mirrorless']")).click();
		List<WebElement> imgs = driver.findElements(By.xpath("//div[contains(text(),'SONY ZV-E10L Mirrorless Camera Interchangeable-lens Vlog Camera')]/../../..//img"));
		int count =0;
		for(WebElement mg:imgs) {
			if(mg.isDisplayed()) {
				count++;
			}
		}
		System.out.println(count);	
		driver.close();
	}

}
