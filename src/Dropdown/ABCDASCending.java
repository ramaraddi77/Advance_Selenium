package Dropdown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ABCDASCending
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/admin/Desktop/HTML%20FILES/ABCDDropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement drop1 = driver.findElement(By.xpath("//select[@id='Alpha']"));
		
		Select selA=new Select(drop1);
		List<WebElement> opt = selA.getOptions();
		
		WebElement drop2 = driver.findElement(By.xpath("//select[@id='Beta']"));
		
		Select selB=new Select(drop2);
		List<WebElement> opt1 = selB.getOptions();
		
		TreeSet<String> tree=new TreeSet<String>();
		
		for (WebElement text1 : opt1) 
		{
			String text = text1.getText();
			tree.add(text);
			
		}
		
		for ( WebElement text2 : opt)
		{
			String text1 = text2.getText();
			tree.add(text1);
		}
		
		
		for (String allopt : tree) 
		{
			System.out.println(allopt);
		}
		

	}

}
