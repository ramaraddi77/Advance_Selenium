package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotofinstagram {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");

		TakesScreenshot ts=(TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dst = new File("./Screenshot/ .jpeg");

		try {
			FileHandler.copy(src, dst);
		} catch (IOException e)
		
		{

			e.printStackTrace();
		}



	}

}
