package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyChromeBrowser {
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dell.com");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("dell application");
		
	
		driver.get("https://www.facebook.com");
		String fbtitle=driver.getTitle();
		System.out.println(title);
		String fburl=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("facebook application");
		

		driver.get("https://www.iplt20.com");
		String ipl=driver.getTitle();
		System.out.println(ipl);
		String iplurl=driver.getCurrentUrl();
		System.out.println(iplurl);
		System.out.println("IPLT20 application");
		
		driver.get("https://www.indiapost.com");
		String posttitle=driver.getTitle();
		System.out.println(posttitle);
		String posturl=driver.getCurrentUrl();
		System.out.println(posturl);
		System.out.println("indiapost application");
		
		driver.get("https://www.lenskart.com");
		String karttitle=driver.getTitle();
		System.out.println(karttitle);
		String lensurl=driver.getCurrentUrl();
		System.out.println(lensurl);
		System.out.println("lenskart application");
		
	
		driver.quit();
	}

}
