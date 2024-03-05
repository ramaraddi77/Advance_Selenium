package Dropdown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompareTwoValueInDropdown
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/HTML%20FILES/TwoDropdown.html");
		Thread.sleep(2000);


		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select sel=new Select(dropdown);
		List<WebElement> options = sel.getOptions();


		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select sel1 = new Select(dropdown1);
		List<WebElement> options1 = sel1.getOptions();

		for (WebElement option : options)
		{
			String text = option.getText();

			for (WebElement seconddrop : options1) 
			{
				String text1 = seconddrop.getText();
				
				if (text.equals(text1)) 
				{
					System.out.println("duplicate");
				}
				
			}
		}

		
	}

}
