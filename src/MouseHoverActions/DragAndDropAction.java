package MouseHoverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		Thread.sleep(2000);
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.dragAndDrop(madrid,spain).perform();*/

		
		
		/*driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick).build().perform();
		Thread.sleep(5000);
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rightclick).perform();*/
		
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).perform();
	}

}
