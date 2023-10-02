package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopUp2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select m=new Select(month);
		m.selectByVisibleText("Jul");
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select y=new Select(year);
		y.selectByValue("1993");
		driver.findElement(By.linkText("7")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		String text = driver.findElement(By.xpath("//span[text()='Please enter valid Policy No.']")).getText();
		System.out.println(text);
		if(text.equals("Please enter valid Policy No."))
		{
			System.out.println("is valid");
		}
		else
		{
			System.out.println("not valid");
		}
		driver.close();
	}

}
