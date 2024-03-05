package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartToAmazon
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("google pixel 6a");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	WebElement price1 = driver.findElement(By.xpath("//div[text()='Google Pixel 6a (Charcoal, 128 GB)']/../../div[2]/div[1]/div[1]/div"));
	Thread.sleep(4000);
	
	String text = price1.getText().replace(",", "");
	System.out.println(text);
	
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("google pixel 6a charcoal");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
	Thread.sleep(2000);
	WebElement price2 = driver.findElement(By.xpath("//span[text()='Google Pixel 6a 5G (Charcoal, 6GB RAM, 128GB Storage)']/../../../../div[3]/div[1]/div[1]/div[1]/div[1]/a/span[1]/span[2]/span[2]"));
	Thread.sleep(5000);
	
	String text1 = price2.getText().substring(1).replace(",", "");
	System.out.println(text1);
	
	/*if(text.equals(text1))
	{
		System.out.println("price is same");
	}
	else
	{
		System.out.println("price is not same");
	}
	
	driver.quit();*/
	
	int flip = Integer.parseInt(text);
	int amazon = Integer.parseInt(text1);
	
	if(flip>amazon)
	
		System.out.println("flipkart price is greater");
	
	else
	
		System.out.println("amazon price is greater");
	
}
}
