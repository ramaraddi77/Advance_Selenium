package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LikePageInFB 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9632092368");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ramaraddi@66");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(15000);
	driver.findElement(By.xpath("//input[@aria-label='Search Facebook']")).sendKeys("qspiders rajajinagar");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Search for ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Qspiders, Rajajinagar']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Like' and@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft']")).click();
	driver.quit();
	
	
	
	
	
	
}
}
