package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class instagramlogin {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Additional SW/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("ramaraddib");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("ramaraddi@66");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		
		
		
		
	}

}
