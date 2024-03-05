package Pop_Up_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class closethechildwindows 

{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Additional SW/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		String pid = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		all_id.remove(pid);
		for (String cid : all_id)
		{
			Thread.sleep(1000);
			driver.switchTo().window(cid);
			driver.close();
		}
		

	}

}
