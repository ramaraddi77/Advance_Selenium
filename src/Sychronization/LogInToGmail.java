package Sychronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInToGmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?hl=en&passive=true&continue=http%3A%2F%2Fsupport.google.com%2Fmail%2Fanswer%2F8494%3Fhl%3Den%26co%3DGENIE.Platform%253DDesktop&ec=GAZAdQ&ifkv=AeAAQh6449wBITJ7rs5n4JaxN3lE6y52zkDxT0ratagk-2kQK_i35krJ6vflikJ5Psa8FrGy1JyR&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	     
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9632092368");
		 
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		


	}

}
