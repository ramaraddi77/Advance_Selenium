package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformkeyboardCtions {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		 WebElement username = driver.findElement(By.id("email"));
		 username.sendKeys("9632092368");
		Thread.sleep(2000);
		username.sendKeys(Keys.TAB,"ramaraddi@66");
		Thread.sleep(2000);
		
		
		
		//WebElement pwd = driver.findElement(By.id("pass"));
	//	pwd.sendKeys("ramaraddi@66");
	//	Thread.sleep(2000);
		username.sendKeys(Keys.ENTER);
		
		
		
		
		
	}

}
