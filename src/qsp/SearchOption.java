package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchOption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Option");
		String option=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/java%20program/Hotel.html");
		WebElement mtrlistbox=driver.findElement(By.id("MTR"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloption = s.getOptions();
		int counter=0;
		for(int i=0;i<alloption.size();i++) {
			String text=alloption.get(i).getText();
			if(text.equals(option)) {
				counter++;
			}
		}
			if(counter==0) {
				System.out.println(option+"is not present");
			}
			else if(counter==1) {
				System.out.println(option+"is present without duplicates");
		}
			else if(counter>1) {
				System.out.println(option+"is present with duplicates");
			}
			driver.close();
	}

}
