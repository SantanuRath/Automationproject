package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReverseAllOptsnOfMtr {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/java%20program/Hotel.html");
		WebElement mtrlistbox=driver.findElement(By.id("cp"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloption = s.getAllSelectedOptions();
		int count=alloption.size();
		System.out.println(count);
		for(int i=count-1;i>0;i--) {
			String text=alloption.get(i).getText();
			System.out.println(text);
		}
			driver.close();
		
	}

}
