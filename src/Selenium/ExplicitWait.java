package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait 
{

	public WebDriver driver;
	
	@Test
	public void checkExplicitWait()
	{
        System.setProperty("webdriver.chrome.driver","D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
		
		driver=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver,100);
		
		String etitle="Demo Guru99 Page";
		
		String atitle="";
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		atitle=driver.getTitle();
		
		if(atitle.equals(etitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		List<WebElement> seleniumlink=driver.findElements(By.tagName("div"));

		seleniumlink= wait.until(ExpectedConditions.visibilityOfAllElements());
		

		
		
		driver.quit();
	}
}
