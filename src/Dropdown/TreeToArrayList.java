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

public class TreeToArrayList 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/HTML%20FILES/Fooddropdown.html");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select sel=new Select(dropdown);
		List<WebElement> options = sel.getOptions();
		TreeSet<String> treset=new TreeSet<String>();
		
			for (WebElement option: options) 
			{
				String text = option.getText();
				treset.add(text);
			}
			
			ArrayList<String> arrlist=new ArrayList<String>(treset);
			for (String list : arrlist) 
			{
				System.out.println(list);
			}
			
	
		
		

	}

}
