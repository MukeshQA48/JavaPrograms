package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCSSSelector 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.cssSelector("input[class=\"_2zrpKA _1dBPDZ\"]")).sendKeys("mukhesh1994@gmail.com");
	
	/*driver.findElement(By.xpath("//a[text()='Login']")).click();
	
	driver.switchTo().alert().accept();
	

	
	boolean status=driver.findElement(By.cssSelector("img[alt=\"Smart Devices (Upto 80% off)\"]")).isDisplayed();
	
	System.out.println(status);*/
}
}
