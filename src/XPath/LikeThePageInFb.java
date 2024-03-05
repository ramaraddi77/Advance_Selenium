package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LikeThePageInFb 
{
 public static void main(String[] args) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9632092368");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ramaraddi@66");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@type='search' and @placeholder='Search Facebook']")).sendKeys("namma bengaluru");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//strong[text()='namma bengaluru']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@aria-label='Namma Bengaluru' and @href='https://www.facebook.com/NammaOoruBengalooru']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-label='Like' and@class='x1i10hfl xjbqb8w x6umtig x1b1mbwd xaqea5y xav7gou x1ypdohk xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x16tdsg8 x1hl2dhg xggy1nq x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x87ps6o x1lku1pv x1a2a7pz x9f619 x3nfvp2 xdt5ytf xl56j7k x1n2onr6 xh8yej3']")).click();
	driver.quit();
	
	
}
}
