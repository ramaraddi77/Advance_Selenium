package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintwitter {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Additional Sw/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9632092368");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ramaraddi@77");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-testid='LoginForm_Login_Button']")).click();
		
		

	}

}
