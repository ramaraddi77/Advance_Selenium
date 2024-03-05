package Sychronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassTheText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/admin/Desktop/webpage.html");
		
		WebElement first=driver.findElement(By.tagName("input"));
		
		first.sendKeys("ram");
		
		first.clear();
		
		
		WebElement second=driver.findElement(By.id("pass"));
		second.sendKeys("123456");
		
		second.clear();
		
		driver.findElement(By.tagName("a")).click();
		


	}

}
