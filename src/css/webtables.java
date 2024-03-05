package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtables {
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
	
	WebElement first=driver.findElement(By.cssSelector("input[id='firstName']"));
	first.sendKeys("ram");
	WebElement second=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	second.sendKeys("BG");
	WebElement email=driver.findElement(By.cssSelector("input[id='userEmail']"));
	email.sendKeys("ramaraddi@gmail.com");
	WebElement age=driver.findElement(By.cssSelector("input[id='age']"));
	age.sendKeys("28");
	WebElement  salary=driver.findElement(By.cssSelector("input[id='salary']"));
	salary.sendKeys("50000");
	WebElement dept=driver.findElement(By.cssSelector("input[id='department']"));
			dept.sendKeys("testing");
	WebElement button=driver.findElement(By.cssSelector("button[id='submit']"));
	button.click();
	
	driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
	
	driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("ram");
    driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("BG");
    driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("ramaraddi66@gmail.com");
    driver.findElement(By.cssSelector("input[id='age']")).sendKeys("28");
    driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("100000");
    driver.findElement(By.cssSelector("input[id='department']")).sendKeys("automation");
    driver.findElement(By.cssSelector("button[id='submit']")).click();
    
    
    driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
	
	driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("ramaraddi");
    driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("BG");
    driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("ramaraddi21@gmail.com");
    driver.findElement(By.cssSelector("input[id='age']")).sendKeys("28");
    driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("150000");
    driver.findElement(By.cssSelector("input[id='department']")).sendKeys("automation testing");
    driver.findElement(By.cssSelector("button[id='submit']")).click();
	
	
	
	
	
	
	
	
	

}
}
