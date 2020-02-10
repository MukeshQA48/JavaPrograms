package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompanyProfile {

	@Test
	public void checkCompanyProfile()
	{
		System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://centurypackersmoversbangalore.in/movers_and_packers_bangalore.php");
		
		driver.findElement(By.linkText("Company Profile")).click();
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		//validating the url of the page using Assert statement.......
		Assert.assertEquals(url, "http://centurypackersmoversbangalore.in/company_profile.php");
		
		//Entering the details to get free Quote
		WebElement Name=driver.findElement(By.cssSelector("#Name"));
		
		Name.sendKeys("Mukhesh");
		
		WebElement Mobile=driver.findElement(By.cssSelector("input[name='mobile']"));
		
		Mobile.sendKeys("7349769692");
		
		WebElement email=driver.findElement(By.xpath("//*[@name='email']"));
		
		email.sendKeys("mukhesh.k48@gmail.com");
		
		WebElement message=driver.findElement(By.cssSelector("textarea[name='message']"));
		
		message.sendKeys("very good professional services");
		
		WebElement getaFreeQuote=driver.findElement(By.cssSelector(".btn"));
		
		getaFreeQuote.click();
		
		//accept the alert
		
		driver.switchTo().alert().accept();
		
	}
}
