package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubeplaysong 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.youtube.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("belakina kavithe kannada song");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@id='video-title'and @title='BANARAS – BELAKINA KAVITHE | ZAID KHAN | SONAL MONTEIRO | JAYATHIRTHA | B. AJANEESH LOKNATH']")).click();
	      Thread.sleep(7000);
	      driver.findElement(By.xpath("////div[@id='segmented-like-button' and @class='style-scope ytd-segmented-like-dislike-button-renderer']")).click();
	
	
	
	}
	
	

} 
