package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubelogin 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		driver.findElement(By.name("search_query")).sendKeys("kannada melody songs");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		
		
	}

}
