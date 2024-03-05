package TestNG_Basic_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class 
{
	public static WebDriver driver;
	@BeforeMethod
	public void Openapp()
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterMethod
	public void Closeapp()
	{
		driver.quit();
	}
}
