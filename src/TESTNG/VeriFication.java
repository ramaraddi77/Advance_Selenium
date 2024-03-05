package TESTNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VeriFication 
{
	public WebDriver driver;
 @Test
 public void Login()
 {
	 System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com");
	 String title = driver.getTitle();
	 assertEquals(title, "Facebook – log in or sign up");
 }
 
 @AfterMethod
 public void closeapp()
 {
	 driver.quit();

 }
}
