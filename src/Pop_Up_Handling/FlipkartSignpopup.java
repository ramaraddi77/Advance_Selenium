package Pop_Up_Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSignpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9632092368");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Request')]")).click();
		
		Thread.sleep(10000);
		
		driver.quit();
		

	}

}
