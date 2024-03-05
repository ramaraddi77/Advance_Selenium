package WEBELEMENT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickActionOnChcekbox
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/HTML%20FILES/checkbox.html");
		Thread.sleep(2000);
		
		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));


		for (WebElement x: check) 
		{
			x.click();
		}
		
		Thread.sleep(2000);
		
		for(int i=10;i>0;i--)
		{
			check.get(i).click();

		}

	}
}
