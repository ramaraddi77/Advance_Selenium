package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class playsonginyoutube
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.youtube.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("naanadada maatellava song");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.partialLinkText("Gaalipata 2 | Naanaadadaa | Video Song | Ganesh | Vaibhavi | Yogaraj Bhat|Jayant Kaikini|Arjun Janya")).click();
	 Thread.sleep(6000); 
	 driver.findElement(By.xpath("//div[@id='segmented-like-button' and @ class='style-scope ytd-segmented-like-dislike-button-renderer']")).click();
	 
}
}
