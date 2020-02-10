package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class FluentWait 
{

	public WebDriver driver;
	
	@Test
	public void checkFluentWait()
	{
		System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		String etitle="Demo Guru99 Page";
		
		String atitle="";
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		atitle=driver.getTitle();
		
		if(atitle.equals(etitle))
		{
			System.out.println("TestPassed");
		}
		else
		{
			System.out.println("TestFailed");
		}
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
	}
}
