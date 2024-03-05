package POModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestScript_DemowebShopRegister
{
	public static WebDriver driver;
	@Test(dataProvider = "data",dataProviderClass = Dataprovider.class)
	public static void Register(String firstname,String lastname,String emailaddress,String password) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Demo_pom_class pmc=new Demo_pom_class(driver);
		Thread.sleep(2000);
		pmc.register();
		Thread.sleep(1000);
		pmc.maleradio();
		Thread.sleep(1500);
		pmc.First(firstname);
		Thread.sleep(1500);
		pmc.Last(lastname);
		Thread.sleep(1500);
		pmc.email(emailaddress);
		Thread.sleep(1500);
		pmc.Pass(password);
		Thread.sleep(1500);
		pmc.Cpass(password);
		Thread.sleep(1500);
		pmc.regbutton();

		driver.navigate().refresh();

		pmc.register();
		Thread.sleep(1000);
		pmc.maleradio();
		Thread.sleep(1500);
		pmc.First(firstname);
		Thread.sleep(1500);
		pmc.Last(lastname);
		Thread.sleep(1500);
		pmc.email(emailaddress);
		Thread.sleep(1500);
		pmc.Pass(password);
		Thread.sleep(1500);
		pmc.Cpass(password);
		Thread.sleep(1500);
		pmc.regbutton();
		
		driver.quit();
	}
}
