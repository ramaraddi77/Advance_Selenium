package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubesong {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("singarasiriye");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Kantara - Singara Siriye |Vijay Prakash|Ananya Bhat |Ajaneesh Loknath |Rishab Shetty|Hombale Films']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id=\'segmented-like-button\']")).click();
	

	

	}

}