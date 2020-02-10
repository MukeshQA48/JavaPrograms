package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class TestwithSikuli 
{
    @Test
	public void facebookLogin() throws Exception
	{
    	Screen screen=new Screen();
    	
    	Pattern username=new Pattern("C:\\Users\\Mukhesh Kummithi\\Desktop\\EmailLogin.png");
    	
    	Pattern password=new Pattern("C:\\Users\\Mukhesh Kummithi\\Desktop\\PasswordLogin.png");
    	
    	Pattern LoginButton=new Pattern("C:\\Users\\Mukhesh Kummithi\\Desktop\\LoginButton.png");
    	
    	System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://www.facebook.com/");
    	
    	screen.wait(username,10);
    	
    	screen.type(username,"mukheshmuku9@gmail.com");
    	
    	screen.type(password, "11129B048");
    	
    	screen.click(LoginButton);
    	
    	/*driver.switchTo().alert().dismiss();
    	
    	WebElement photo=driver.findElement(By.xpath("//input[@title='Choose a file to upload' and @name='composer_photo[]' and @id='js_b' ]"));
    	
    	photo.click();
    	
    	Pattern filename=new Pattern("C:\\Users\\Mukhesh Kummithi\\Desktop\\Filename.png");
    	
    	Pattern openButton=new Pattern("C:\\Users\\Mukhesh Kummithi\\Desktop\\OpenButton.png"); 
    	
    	screen.wait(photo,10);*/
    	
    
    	
	}
	
	
	
}
