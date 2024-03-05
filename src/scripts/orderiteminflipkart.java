package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orderiteminflipkart {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Additional SW/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("flipkart");
		
	}

}
