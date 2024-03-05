package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shaadilogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Additional Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");
		driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9945212177");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("9945212177");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
