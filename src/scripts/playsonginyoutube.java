package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class playsonginyoutube 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.youtube.com");
	   Thread.sleep(2000);
	   driver.findElement(By.name("search_query")).sendKeys("hara hara shambhu");
	   Thread.sleep(1500);
	   driver.findElement(By.id("search-icon-legacy")).click();
	   Thread.sleep(1500);
	   driver.findElement(By.linkText("Har Har Shambhu Shiv Mahadeva | हर हर शंभू | Har Har Shambhu | Abhilipsa Panda ft. Jeetu Sharma")).click();
	   
	   
   }
	
}
