package PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(PropertyFile.ListenerClass.class)
public class facebookproperty 
{
	@Test
	public void Scripts() throws IOException, InterruptedException
	{
		       FileInputStream fileInputStream = new FileInputStream("./property/property.properties");
		       
		       Properties prop=new Properties();
		       prop.load(fileInputStream);
		
		System.setProperty("webdriver.chrome.driver","./Additional Sw/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("UN"));
		Thread.sleep(7000);
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("PWD"));
		Thread.sleep(2000);
		driver.quit();
	}
}
