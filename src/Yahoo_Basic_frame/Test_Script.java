package Yahoo_Basic_frame;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_Script extends Base_class
{
  @Test(dataProvider = "YahooLoginCred",dataProviderClass = Data_provider.class)
  public static void login(String UN,String PASS,String To,String Subject,String Body ) throws InterruptedException, AWTException
  {
	  driver.findElement(By.name("username")).sendKeys(UN);
	  Thread.sleep(2000);
	  driver.findElement(By.name("signin")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("password")).sendKeys(PASS);
	  Thread.sleep(2000);
	  driver.findElement(By.name("verifyPassword")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//a[@aria-label='Check your mail']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys(To);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys(Subject);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys(Body);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@aria-label='Attach files']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[text()='Attach files from computer']")).click();
	  
	  Robot r=new Robot();
	  for(int i=0; i<7;i++)
	  {
		  r.keyPress(KeyEvent.VK_TAB);
		  Thread.sleep(1000);
		  r.keyRelease(KeyEvent.VK_TAB);
	  }

	  r.keyPress(KeyEvent.VK_DOWN);
	  Thread.sleep(2000);
	  r.keyRelease(KeyEvent.VK_DOWN);

	  r.keyPress(KeyEvent.VK_DOWN);
	  Thread.sleep(2000);
	  r.keyRelease(KeyEvent.VK_DOWN);

	  r.keyPress(KeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  r.keyRelease(KeyEvent.VK_ENTER);



	  r.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(1000);
	  r.keyRelease(KeyEvent.VK_TAB);

	  r.keyPress(KeyEvent.VK_DOWN);
	  Thread.sleep(2000);
	  r.keyRelease(KeyEvent.VK_DOWN);

	  r.keyPress(KeyEvent.VK_DOWN);
	  Thread.sleep(2000);
	  r.keyRelease(KeyEvent.VK_DOWN);


	  r.keyPress(KeyEvent.VK_ENTER);
	  Thread.sleep(1000);
	  r.keyRelease(KeyEvent.VK_ENTER);

	  for(int i=0; i<=9;i++)
	  {
		  r.keyPress(KeyEvent.VK_TAB);
		  Thread.sleep(1000);
		  r.keyRelease(KeyEvent.VK_TAB);
	  }

	  r.keyPress(KeyEvent.VK_ENTER);
	  Thread.sleep(1000);
	  r.keyRelease(KeyEvent.VK_ENTER);

	  for(int i=0;i<=1;i++)
	  {
		  r.keyPress(KeyEvent.VK_DOWN);
		  Thread.sleep(2000);
		  r.keyRelease(KeyEvent.VK_DOWN);
	  }
	  
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  Thread.sleep(1000);
	  r.keyRelease(KeyEvent.VK_ENTER);


	  driver.findElement(By.xpath("//span[text()='Send']")).click();
	  
	  Actions act=new Actions(driver);
	  
	  act.moveToElement(driver.findElement(By.xpath("//span[text()='  RAMARADDI ']"))).perform();
	  
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[contains(text(),'Sign out')]")).click();
	  Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@title='Mail']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[@role='button']")).click();
      Thread.sleep(1000);
	  driver.findElement(By.name("username")).sendKeys(To);
	  Thread.sleep(2000);
	  driver.findElement(By.name("signin")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("password")).sendKeys(PASS);
	  Thread.sleep(1000);
	  driver.findElement(By.name("verifyPassword")).click();
	  Thread.sleep(1000);
      driver.findElement(By.xpath("//div[@title='Mail']")).click();
      
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
}
