package Sychronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LikePageInFB {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9632092368");
	
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ramaraddi@66");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	
		driver.findElement(By.xpath("//input[@aria-label='Search Facebook']")).sendKeys("qspiders rajajinagar");
		
		driver.findElement(By.xpath("//span[text()='Search for ']")).click();
		
		driver.findElement(By.xpath("//span[text()='Qspiders, Rajajinagar']")).click();
	
		driver.findElement(By.xpath("//span[text()='Like' and@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft']")).click();
		driver.quit();
		

	}

}
