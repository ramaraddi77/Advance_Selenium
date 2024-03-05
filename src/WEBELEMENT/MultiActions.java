package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.moneycontrol.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.zerodha.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		un.sendKeys("9632092368");
		Thread.sleep(2000);
		un.sendKeys(Keys.TAB,"ramaraddi@66");
		Thread.sleep(2000);
		un.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
		

	}

}
