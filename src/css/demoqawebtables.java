package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqawebtables {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='delete-record-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='delete-record-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='delete-record-3']")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("ram");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("BG");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("ramaraddi61@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='age']")).sendKeys("28");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("50000");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='department']")).sendKeys("Automation testing");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("button[id='submit']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("ramaraddi");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("BG");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("ramaraddi66@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='age']")).sendKeys("28");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("100000");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='department']")).sendKeys("Automation testing");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("button[id='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("ramaraddi");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("BG");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("ramaraddi21@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='age']")).sendKeys("28");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("150000");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='department']")).sendKeys("Automation testing");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("button[id='submit']")).click();
		Thread.sleep(2000);
		
	}

}
