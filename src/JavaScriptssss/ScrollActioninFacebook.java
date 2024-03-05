package JavaScriptssss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollActioninFacebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("9632092368");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("ramaraddi@66");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		
		alert.accept();
		

	}

}
