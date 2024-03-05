package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orderproductinamazon
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.name("field-keywords")).sendKeys("puma shoes for men");
		driver.findElement(By.id("nav-search-submit-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Mens Pacer Fire Sneaker")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='native_dropdown_selected_size_name']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		
	
	}

}
