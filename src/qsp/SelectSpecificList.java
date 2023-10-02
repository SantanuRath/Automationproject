package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectSpecificList {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/java%20program/selenium.html");
		int row=driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
		System.out.println(row);
		int col=driver.findElements(By.xpath("html/body/table/tbody/tr/td")).size();
		System.out.println(col);
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				String s=driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(s);
			}
			driver.close();
		}
		//driver.close();
	}

}
