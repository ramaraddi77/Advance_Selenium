package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Additional Sw/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ram");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("BG");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9945212177");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9632092368");
	Thread.sleep(2000);
	WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	
	radio.click();
	if(radio.isSelected())
	{
		System.out.println("selected");
	}
	else
	{
		System.out.println("not selected");
	}
}
}
