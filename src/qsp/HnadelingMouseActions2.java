package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HnadelingMouseActions2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement resource = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(resource).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement readfullstory = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(readfullstory).perform();
	    //String text = driver.findElement(By.xpath("//h1[contains(text(),'HackerEarth ')]")).getText();
		//System.out.println(text);
	    //String tex = "HackerEarth + Vtiger CRM";
		/*if(text.equals(tex)) {
			System.out.println("HackerEarth page is displayed");
		}
		else {
			System.out.println("HackerEarth page is not displayed");
		}*/
		boolean text = driver.findElement(By.xpath("//h1[contains(text(),'HackerEarth ')]")).isDisplayed();
		if(text==true) {
			System.out.println("page is displayed");
		}
		else {
			System.out.println("page is not displayed");
		}
	}

}
