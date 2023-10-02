package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphbeticOrderUsingTst {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/java%20program/Hotel.html");
		WebElement mtrlistbox=driver.findElement(By.id("MTR"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloption = s.getOptions();
		TreeSet<String> ts=new TreeSet<String>();
		for(int i=0;i<alloption.size();i++) {
			String text=alloption.get(i).getText();
			ts.add(text);
		}
		for(String Option:ts) {
			System.out.println(Option);
		}
		driver.close();
	}

}
