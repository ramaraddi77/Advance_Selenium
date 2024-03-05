package BasicHybridFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class 
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com");
		
	}
	@AfterMethod
	public void closeapp()
	{
		driver.quit();
	}
}
