package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement gog = driver.findElement(By.xpath("//input[@title='Search']"));

		gog.sendKeys("kavin");
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		jse.executeScript("window.scrollBy("+x+","+y+")");
		ele.click();
		Thread.sleep(5000);

		List<WebElement> links = driver.findElements(By.xpath("(//h3)"));
		WebElement text = links.get(5);
		int count = links.size();
		System.out.println(count);
		String text1 = text.getText();
		System.out.println(text1);


		/*	Point loc1 = links.getLocation();
				int x1 = loc1.getX();
				int y2 = loc1.getY();
				jse.executeScript("window.scrollBy("+x1+","+y2+")");

				links.click();
				String text = links.getText();
				System.out.println(text);

				Thread.sleep(8000);*/
		
		
		driver.quit();







	}

}
