package Dropdown;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderItemInAmozon 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Additional SW/chromedriver1.exe");
		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("puma shoes for men");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(1000);
		WebElement link = driver.findElement(By.xpath("//span[text()='Mens Pacer Fire Sneaker']/../../a/span"));
		
		Point loc = link.getLocation();
		int x = loc.getX();
		System.out.println(x);
		int y = loc.getY();
		System.out.println(y);
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		
		Thread.sleep(1000);
		link.click();
		
		
//		Thread.sleep(2000);
//		WebElement drop = driver.findElement(By.xpath("//select[@name='dropdown_selected_size_name']"));
		Thread.sleep(5000);
		String pid = driver.getWindowHandle();
		Set<String> id = driver.getWindowHandles();
		int size = id.size();
		System.out.println(size);
		
		ArrayList<String> arr=new ArrayList<String>(id);
		String cid = arr.get(1);
		Thread.sleep(2000);
		driver.switchTo().window(cid);
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//select[@name='dropdown_selected_size_name']"));
		
		Select sel=new Select(drop);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		WebElement sign = driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
		Point location = sign.getLocation();
		int x2 = location.getX();
		int y2 = location.getY();
		js.executeScript("window.scrollBy("+x2+","+y2+")") ;
		Thread.sleep(2000);
	    sign.click();

	

	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
