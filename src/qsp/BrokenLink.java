package qsp;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count=links.size();
		for(int i=0;i<count;i++) {
			String url = links.get(i).getAttribute("href");
			//System.out.println(url);
			URL link=new URL(url);
			HttpURLConnection hc= (HttpURLConnection)link.openConnection();
			hc.connect();
			int rescode=hc.getResponseCode();
			if(rescode>=400) {
				System.out.println(url+"__"+"brokenlink");
			}
			else {
				System.out.println(url="__"+"is valid lnk");
			}
		driver.close();
		}
	}

}
