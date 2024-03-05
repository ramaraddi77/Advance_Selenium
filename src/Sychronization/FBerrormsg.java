package Sychronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBerrormsg {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Additional Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		WebElement errormsg = driver.findElement(By.xpath("//div[contains(text(),'The email address ')]"));
		String error = errormsg.getText();
		System.out.println(error);

	}

}
