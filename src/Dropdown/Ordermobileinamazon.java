package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ordermobileinamazon
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Additional SW/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(4000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("puma shoes for men");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		
	}

}
