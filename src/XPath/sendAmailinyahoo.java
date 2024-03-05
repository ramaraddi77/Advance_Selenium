package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendAmailinyahoo 
{
 public static void main(String[] args) throws InterruptedException
 {
	System.setProperty("webdriver.chrome.driver","./Additional Sw/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login.yahoo.com/?.intl=in");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ramaraddibg");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("9972149415");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@title='Mail']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("bgramaraddi@yahoo.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("EOD report");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("dear sir");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@title='Send this email']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='  RAMARADDI ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Sign out']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Sign In']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@role='button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bgramaraddi");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("9972149415");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@title='Mail']")).click();
	
	
			
	
}
}
