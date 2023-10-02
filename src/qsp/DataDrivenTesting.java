package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		FileInputStream fis=new FileInputStream("./data/command.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("Url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		driver.close();
	}

}
