package Basic_Framework_TESTNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BASE_class 
{
 public static WebDriver driver;
 @BeforeMethod
 public void Openapp()
 {
	 System.setProperty("webdriver.gecko.driver","./Additional SW/geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.navigate().to("https://www.facebook.com/");
	 
 }
 @AfterMethod
 public void closeapp()
 {
	 driver.quit();
 }
 
}
