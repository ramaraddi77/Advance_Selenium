package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqatextbox {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1500);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Ramaraddi BG");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("ramaraddi61@gmail.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("textarea[placeholder='Current Address']")).sendKeys("#12 Ashta 1St main road, BDA layout, pattegarapalya,vijayanagar bengaluru-560079");
		driver.findElement(By.cssSelector("textarea[id='permanentAddress']")).sendKeys("#12 Ashta 1St main road, BDA layout, pattegarapalya,vijayanagar bengaluru-560079");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[id='submit']")).click();
				
		
		
		
	
	}

}
