package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerificationTest_2 
{
	public WebDriver driver;
  @Test
  public void Login()
  {
	  System.setProperty("webdriver.gecko.driver","./Additional SW/geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  
	  SoftAssert sft=new SoftAssert();
	  driver.get("https://www.facebook.com");
	  String title = driver.getTitle();
	  sft.assertEquals(title, "Facebook – log in or signup");
	  driver.findElement(By.id("email")).sendKeys("test case pass");
	  sft.assertAll();
  }
}
