package JavaScriptssss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFaceBook 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://demoqa.com/dynamic-properties");
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Will enable 5 seconds']")))).click();
		
		driver.findElement(By.xpath("//button[text()='Visible After 5 Seconds']")).click();
		
	}

}
