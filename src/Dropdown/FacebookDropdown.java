package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		
   System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 Thread.sleep(2000);
 driver.manage().window().maximize();
 Thread.sleep(2000);
 driver.get("https://www.facebook.com/");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
 Thread.sleep(2000);
 
 
WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
Thread.sleep(2000);
 Select sel=new Select(dropdown1);
 sel.selectByValue("25");
 
 Thread.sleep(2000);
WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
 Thread.sleep(2000);
 Select sel1=new Select(month);
 sel1.selectByValue("7");
 
 WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
 Thread.sleep(2000);
 Select sel2=new Select(year);
 sel2.selectByValue("1994");
 
 
 
 
	}

}
