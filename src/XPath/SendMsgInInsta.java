package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendMsgInInsta {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9632092368");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ramaraddi@66");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[text()='Messages']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Sachin Udnoor']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Message...']")).sendKeys("hi guys");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Send']")).click();
		
	}

}
