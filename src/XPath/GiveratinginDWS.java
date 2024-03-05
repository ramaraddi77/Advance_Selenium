package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiveratinginDWS
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./Additional Sw/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ramaraddi21@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9632092368");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Show products in category Cell phones']/../../h2/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Smartphone']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Add your review']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='AddProductReview.Title']")).sendKeys("Rockyyy");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@name='AddProductReview.ReviewText']")).sendKeys("bhavanegalige olagagabeda elli adakke bele ella,");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='addproductrating_4']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='add-review']")).click();
	Thread.sleep(10000);
	//driver.quit();
	
}
}
