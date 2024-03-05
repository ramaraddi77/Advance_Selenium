package scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser1 {
	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		String value="./Additional SW/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver Driver =new ChromeDriver();
		
	}

}
