package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NumberOptionsInDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/HTML%20FILES/Fooddropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select sel=new Select(dropdown);
		List<WebElement> options = sel.getOptions();
		int count = options.size();
		System.out.println(count);
		
		for(WebElement option : options)
		{
			String text = option.getText();
			System.out.println(text);
		}
		

	}

}
