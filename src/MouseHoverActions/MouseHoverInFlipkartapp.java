package MouseHoverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverInFlipkartapp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(4000);
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		Thread.sleep(4000);
		act.moveToElement(fashion).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Men Footwear']")).click();
		driver.quit();
		

	}

}
