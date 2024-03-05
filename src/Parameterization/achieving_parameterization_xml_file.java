package Parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class achieving_parameterization_xml_file
{
	public WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void openapp(String brow)
	{
		if(brow.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
		}
		else if (brow.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","./Additional SW/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
		}
		
	}
	@Test
	public void Testscript()
	{
		System.out.println("achieved parameterization");
	}
	@AfterMethod
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
