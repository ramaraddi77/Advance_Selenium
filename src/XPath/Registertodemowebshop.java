package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registertodemowebshop
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Additional Sw/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@href='/register']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("RAM");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("BG");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ramaraddi21@gmail.com");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9632092368");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("9632092368");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ramaraddi21@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9632092368");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='button-1 login-button' and @type='submit']")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//a[@href='/books' and @class='hover']")).click();
	driver.findElement(By.linkText("Books")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Computing and Internet")).click();
	driver.findElement(By.xpath("//input[@value='Add to cart' and @class='button-2 product-box-add-to-cart-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/cart']")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']")).click();
	driver.quit();
	
	
	
}
}
