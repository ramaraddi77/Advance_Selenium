package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukriloginpage 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=16201&err=1");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("ramaraddi b g");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("ramaraddi66@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.id("mobile")).sendKeys("9632092368");
		Thread.sleep(2000);
		driver.findElement(By.className("checkbox-wrap")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("submitbtn resman-btn-primary resman-btn-regular resman-btn-disabled")).click();
	}

}
