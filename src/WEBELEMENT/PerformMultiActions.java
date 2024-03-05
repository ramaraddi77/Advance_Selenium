package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformMultiActions 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Additional SW/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(2000);
	WebElement tooltip = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
	Thread.sleep(2000);
	String tip = tooltip.getAttribute("class");
	System.out.println(tip);
	
	Point loc = tooltip.getLocation();
	System.out.println(loc);
	
	Point drag = new Point(500, 450);
	driver.manage().window().setPosition(drag);
	
	Dimension size = tooltip.getSize();
	System.out.println(size);
	
}
}
