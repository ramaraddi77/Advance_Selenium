package Pop_Up_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseSpecificChildBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Additional SW/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> all_id = driver.getWindowHandles();
		for (String id : all_id)
		{
			Thread.sleep(2000);
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if (title.contains("About me")) 
			{
				driver.close();
			}
		}

	}

}
