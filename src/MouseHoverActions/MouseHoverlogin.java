package MouseHoverActions;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverlogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9632092368");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ramaraddi@77");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@value='Save for later']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("studds helmet for men");
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='RESULTS']/../../../../../following-sibling::div/div/div/div/div/div/div/div[2]/span/a")).click();
		Thread.sleep(1000);
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<>(ids);
		String id = arr.get(1);
		driver.switchTo().window(id);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(1000);
		
		

	}

}
