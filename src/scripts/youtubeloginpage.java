package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubeloginpage
{
  public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "./Additional SW/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	
	driver.findElement(By.name("search_query")).sendKeys("nanadada maatellava");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("search-icon-legacy")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Gaalipata 2 | Naanaadadaa | Video Song | Ganesh | Vaibhavi | Yogaraj Bhat|Jayant Kaikini|Arjun Janya")).click();
	}
}
