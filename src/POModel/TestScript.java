package POModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScript 
{
	@Test
	public void Script() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		pom_class pmc=new pom_class(driver);
		pmc.username("9632092368");
		Thread.sleep(2000);
		driver.navigate().refresh();
		pmc.username("ramaradd66");

	}

}
