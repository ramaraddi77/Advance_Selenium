package Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling3DropdownsInDWS {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ramaraddi21@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9632092368");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='header-menu']/ul/li[4])[1]")).click();
		Thread.sleep(2000);
		
		WebElement d1 = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select sel=new Select(d1);
		sel.selectByVisibleText("Name: A to Z");
		Thread.sleep(2000);
		
		WebElement d2 = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select sel1 = new Select(d2);
		sel1.selectByVisibleText("12");
		Thread.sleep(2000);
		
		WebElement d3 = driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		Select sel2=new Select(d3);
		sel2.selectByVisibleText("List");
		Thread.sleep(2000);
		
		List<WebElement> multi = driver.findElements(By.xpath("//span[@class='price actual-price']"));
		//TreeSet<String>tset=new TreeSet<String>();
		ArrayList<String> alist=new ArrayList<String>();
		
		for (WebElement text : multi)
		{
			String alldata = text.getText();
			
			alist.add(alldata);
		}
		
		TreeSet<String>Tset=new TreeSet<String>(alist);
		
		
		//Collections.sort(alist);
		
		for (String sorted : Tset) 
		{
			System.out.println(sorted);
		}
		
		
		
		
		

	}

}
