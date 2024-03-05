package Pop_Up_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenMulipleTAbs {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);

		//Element address
		
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='Support']"));
		
		//Add all the address into the collection
		
		ArrayList<WebElement> a=new ArrayList<WebElement>();
		
		a.add(ele1);
		a.add(ele2);
		a.add(ele3);
		a.add(ele4);
		
		Actions act=new Actions(driver);
		
		Robot r=new Robot();
		
		//perform Actions
		
		for (WebElement addr : a)
		{
			Thread.sleep(1000);
			act.contextClick(addr).perform();
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}

		Set<String>all_id = driver.getWindowHandles();

		Thread.sleep(2000);
		int size = all_id.size();
		Thread.sleep(1000);
		System.out.println(size);

		ArrayList <String> arr=new ArrayList <String> (all_id);
		String tab =arr.get(4);
		Thread.sleep(2000);
		driver.switchTo().window(tab);


	}

}
