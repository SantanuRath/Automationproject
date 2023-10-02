package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUploadPopUp {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/java430/Naukri.html");
		Thread.sleep(2000);
		File f=new File("./data/Rabi.doc");
		String absolutepath=f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(absolutepath);
	}

}
