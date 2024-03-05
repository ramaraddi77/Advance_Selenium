package ExtentReport;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreport 
{
	public WebDriver driver;
	@Test
	public void extentreport()
	{
		//to genarate htmlreport

		ExtentHtmlReporter rep=new ExtentHtmlReporter("./extentreport/report1.html");

		//to extent report

		ExtentReports report=new ExtentReports();

		report.attachReporter(rep);

		ExtentTest test = report.createTest("Ram");

		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		test.log(Status.INFO, "Browser is launched");
		driver.navigate().to("https://Zomato.com");
		test.log(Status.INFO, "application is launched");


		String title = driver.getTitle();
		if(title.equals("tomato"))
		{
			test.log(Status.PASS, "Homepage is displayed");
		}
		else
		{
			test.log(Status.FAIL, "Homepage is not displayed");
		}



		try
		{
			test.addScreenCaptureFromPath(screenshot());
		} 

		catch (IOException e)
		{
			e.printStackTrace();
		}

		report.flush();
		driver.quit();

	}

	public String screenshot()
	{
		String path="./Screenshot/zomato.jpeg";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/zomato.jpeg");

		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return "."+path;
	}

}
