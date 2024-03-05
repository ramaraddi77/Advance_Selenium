package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukriregisterpage {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.findElement(By.id("email")).sendKeys("9632092368");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("ramaraddi@66");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

	}

}
