package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqalinks {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("9632092368");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("ramaraddi@66");
		driver.findElement(By.cssSelector("button[value='1']")).click();
		
		
		
	}

}
