package Basic_Framework_TESTNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Scripts1 extends BASE_class
{
   @Test(dataProvider = "logincredentials",dataProviderClass = DATA_provider.class)
   public static void Login(String un,String pass) throws InterruptedException
   {
	   driver.findElement(By.id("email")).sendKeys(un);
	   Thread.sleep(2000);
	   driver.findElement(By.id("pass")).sendKeys(pass);
	   Thread.sleep(2000);
	   driver.findElement(By.name("login")).click();
   }
}
