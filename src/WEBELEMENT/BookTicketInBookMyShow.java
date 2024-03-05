package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTicketInBookMyShow
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Additional Sw/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Varisu']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//ul[@id='venuelist']/li[5]/div[2]/div[2]/div[4]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[text()='Accept'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[@id='pop_4']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
        Thread.sleep(5000);
        WebElement seat = driver.findElement(By.xpath("//div[@class='seatR Setrow1' and text()='C']/../following-sibling::td[1]/div[3]/a"));
        seat.click();
        
        if(seat.isEnabled())
        {
        	System.out.println("seats are selected");
        }
        else
        {
        	System.out.println("seats are not selected");
        }
	}
}
