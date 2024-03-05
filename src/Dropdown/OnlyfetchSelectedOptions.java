package Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyfetchSelectedOptions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/HTML%20FILES/Fooddropdown.html");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select sel=new Select(dropdown);
		
		/*sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("5");
		Thread.sleep(2000);
		sel.selectByVisibleText("biryani");
		
		List<WebElement> selecteddropdown = sel.getAllSelectedOptions();
		
		for (WebElement option : selecteddropdown) 
		{
			String text = option.getText();
			System.out.println(text);
		}*/
		
		List<WebElement> options = sel.getOptions();
		
		ArrayList<String> arlist=new ArrayList<String>();
		
		for(WebElement option:options)
		{
			String text = option.getText();
			arlist.add(text);
		}
		
		Collections.sort(arlist);
		for (String sorted : arlist)
		{
			System.out.println(sorted);
		}
		
		Collections.sort(arlist,Collections.reverseOrder());
		
		for (String desc : arlist)
		{
			System.out.println(desc);
		}
		}
	}


