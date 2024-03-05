package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class facebook 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement text = driver.findElement(By.id("email"));
		
		//File src = ts.getScreenshotAs(OutputType.FILE);
		File src = text.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Screenshot/fb.jpeg");
		try 
		{

			FileHandler.copy(src, dst);
		} 

		catch (IOException e)
		{

			e.printStackTrace();
		}

		driver.quit();


	}

}
