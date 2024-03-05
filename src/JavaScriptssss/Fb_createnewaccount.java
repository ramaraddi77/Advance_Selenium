package JavaScriptssss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_createnewaccount {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Additional SW/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1500);
		WebElement cust = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("arguments[0].value='nanalla'",cust);	
		driver.findElement(By.name("sex")).click();
		driver.quit();

	}

}
