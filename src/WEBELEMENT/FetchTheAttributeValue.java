package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTheAttributeValue 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Additional SW/chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	/*WebElement link = driver.findElement(By.xpath("//a[@href='https://kn-in.facebook.com/']"));
	Thread.sleep(2000);
	String Attributevalue = link.getAttribute("href");
	System.out.println( Attributevalue);*/

	/*WebElement createapage = driver.findElement(By.xpath("//a[text()='Create a Page']"));
	Point loc = createapage.getLocation();
	System.out.println(loc);
	System.out.println(loc.getX());
	System.out.println(loc.getY());*/

	/*Point p = new Point(500, 300);
	driver.manage().window().setPosition(p);*/
	
	/*WebElement FB = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	Dimension size = FB.getSize();
	System.out.println(size);
   int height = size.getHeight();
   System.out.println(height);
   int width = size.getWidth();
   System.out.println(width);*/
	
   Dimension d = new Dimension(500,400);
   driver.manage().window().setSize(d);
   Point p = new Point(400, 450);
   driver.manage().window().getPosition();
   
}
}
