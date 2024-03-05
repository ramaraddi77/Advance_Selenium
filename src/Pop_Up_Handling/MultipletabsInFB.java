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

public class MultipletabsInFB {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//Element Address
		
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Log in']"));
		WebElement ele3 = driver.findElement(By.xpath("//a[text()='Messenger']"));
		WebElement ele4 = driver.findElement(By.xpath("//a[text()='Facebook Lite']"));
		WebElement ele5 = driver.findElement(By.xpath("//a[text()='Watch']"));
		WebElement ele6 = driver.findElement(By.xpath("//a[text()='Places']"));
		
		//Add all address into collection
		
		ArrayList<WebElement> arr=new ArrayList<WebElement>();
		arr.add(ele1);
		arr.add(ele2);
		arr.add(ele3);
		arr.add(ele4);
		arr.add(ele5);
		arr.add(ele6);
		
		Actions act=new Actions(driver);
		Robot r=new Robot();
		
		//perform actions
		
		for (WebElement allid : arr)
		{
			Thread.sleep(2000);
			act.contextClick(allid).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}
		
		
		Set<String> ids = driver.getWindowHandles();
//		int count = ids.size();
//		System.out.println(count);
		
		
		ArrayList<String> a=new ArrayList<String>(ids);
		Thread.sleep(2000);
		String tab = a.get(2);
		driver.switchTo().window(tab);
		System.out.println(driver.getTitle());
		
		
	}

}
