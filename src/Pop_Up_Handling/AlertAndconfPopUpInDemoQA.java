package Pop_Up_Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertAndconfPopUpInDemoQA {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		//WebDriverWait wait=new WebDriverWait(driver, 10);

		driver.get("https://demoqa.com/alerts");


		/*wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("alertButton")))).click();
		Alert A = driver.switchTo().alert();
		Thread.sleep(2000);
		A.accept();*/



		/*driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();*/



		/*driver.findElement(By.id("confirmButton")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.dismiss();
		Thread.sleep(2000);*/



		WebElement loc = driver.findElement(By.id("promtButton"));
		Point x = loc.getLocation();
		int x1 = x.getX();
		int y1 = x.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x1+","+y1+")");
		loc.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("xxx");
		Thread.sleep(3000);
		alert.accept();
		driver.quit();
	}

}
