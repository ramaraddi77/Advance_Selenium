package Yahoo_Basic_frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class
{
   public static WebDriver driver;
   @BeforeMethod
   public static void openapp()
   {
	   System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   driver.get("https://login.yahoo.com/?.lang=en-US&src=mobile&activity=ybar-signin&done=https%3A%2F%2Fau.mobile.yahoo.com%2Fmail%3Fguccounter%3D1%26guce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAGcFMtUg5l3dDCozeAVXBpE2jTB2zCZKO1PyPYt1Xq4vcIjirJZJBaVGFuBSox3LNSLsx1JaaGynvDFFjI5kqnpSDvJR0FwEsKO7R1e64Kd6qGlw5GgNFnnwMl4cIwAHq3mZE9q0LeWcYqZo5fKprhPG2lDOm1DQlBmOjSao_4fY&add=1");
   }
   @AfterMethod
   public void closeapp()
   {
	  driver.quit();
   }
}
