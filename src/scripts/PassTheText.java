package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassTheText {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Additional SW/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.get("file:///C:/Users/admin/Desktop/webpage.html");
				Thread.sleep(1000);
				WebElement first=driver.findElement(By.tagName("input"));
				Thread.sleep(2000);
				first.sendKeys("ram");
				Thread.sleep(2000);
				first.clear();
				
				
				WebElement second=driver.findElement(By.id("pass"));
				second.sendKeys("123456");
				Thread.sleep(2000);
				second.clear();
				
				driver.findElement(By.tagName("a")).click();
				
				
				
	}

}
