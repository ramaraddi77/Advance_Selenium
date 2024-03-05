package Pop_Up_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Childbrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Additional SW/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		//parent id
		
		driver.get("https://skpatro.github.io/demo/links/");
//		String p_id = driver.getWindowHandle();
//		System.out.println(p_id);
		
		//count the number of browser
		
		/*driver.findElement(By.name("NewWindow")).click();
		Set<String> all_id = driver.getWindowHandles();
		int count = all_id.size();
		System.out.println(count);
		
		for (String id : all_id)
		{
			System.out.println(id);
		}*/
		
		
		
		//fetch the all the titles and close one NewWindow
		
		/*Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Set<String> all_id = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String id : all_id)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			driver.close();
		}*/
		
		//close the only parent window
		String p_id = driver.getTitle();
		String pid = driver.getWindowHandle();
		driver.findElement(By.name("NewWindow")).click();
		Set<String> all_id = driver.getWindowHandles();
		Thread.sleep(2000);
		
		for (String id : all_id)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			if (all_id.equals(id))
			{
				driver.close();
			}
		}
		
		
		//close the only child window
		/*String pid = driver.getTitle();
		driver.findElement(By.name("NewWindow")).click();
		Set<String> all_id = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String id : all_id)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			if (pid.equals(id))
			{
				
			}
			else 
			{
				driver.close();
			}
		}*/
		
	}

}
