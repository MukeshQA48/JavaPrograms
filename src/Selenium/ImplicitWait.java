package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait 
{

	public WebDriver driver;
	@Test
	public void checkImplicitWait()
	{
		System.setProperty("webdriver.chrome.driver","D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
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
		
		driver.quit();
	}
}
