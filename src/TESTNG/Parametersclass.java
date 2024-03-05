package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametersclass 
{
   public WebDriver driver;
  @Parameters("browser")
  @BeforeMethod()
  public void browser(String brow)
  {
	  if(brow.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","./Additional SW/geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/");
	  }
	  else if(brow.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/");
	  }
  }
  
  @Test
  public void openapp()
  {
	  System.out.println("open the app");
  }
  
  @AfterMethod
  public void closeapp()
  {
	  driver.quit();
  }
}

