package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendReqInInsta 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Additional Sw/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9632092368");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ramaraddi@66");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='Search']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("sandeepshadakshari");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='sandeepshadakshari']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='button']")).click();
}
}
