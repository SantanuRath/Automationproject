package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EqualHeightWidth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement usertbx=driver.findElement(By.id("username"));
		WebElement usertb=driver.findElement(By.name("pwd"));
		int h1=usertbx.getSize().getHeight();
		int w1=usertbx.getSize().getWidth();
		int h2=usertb.getSize().getHeight();
		int w2=usertb.getSize().getWidth();
		if(h1==h2 && w1==w2 )
		{
			System.out.println("Textbox are equal");
		}
		else
		{
			System.out.println("Texbox are not equal");
		}
		driver.close();
	}

}
