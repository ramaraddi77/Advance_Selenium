package XPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SearchPlaceInMaps 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/maps/@21.125498,81.914063,5z?hl=en");

	driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();

	driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("vijayanagar");

	driver.findElement(By.xpath("//input[@aria-controls='sbsg52']")).sendKeys("rajajinagar");

	driver.findElement(By.xpath("(//button[@aria-label='Search'])[3]")).click();

	driver.findElement(By.xpath("//span[@id='section-directions-trip-details-msg-0']")).click();
}
}
