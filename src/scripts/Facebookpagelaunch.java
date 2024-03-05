package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookpagelaunch {
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("9632092368");
		
		driver.findElement(By.name("pass")).sendKeys("ramaraddi@66");
		
		driver.findElement(By.name("login")).click();
		
	}

}
