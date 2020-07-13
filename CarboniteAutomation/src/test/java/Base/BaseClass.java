package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass
{
	public WebDriver driver;
	@Test
	public void BrowserSetUp()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium practice\\CarboniteAutomation\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver(); 
	    driver.get("https://www.carbonite.com/backup-software/safe-personal-trial/");   
	    driver.manage().window().maximize();
	   
	}

	public void CloseBrowser() 
	{
		
		driver.close();
	}
}
