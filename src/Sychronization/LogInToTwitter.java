package Sychronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInToTwitter {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Additional Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9632092368");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ramaraddi@77");
		
		driver.findElement(By.xpath("//div[@data-testid='LoginForm_Login_Button']")).click();
		
		

	}

}
