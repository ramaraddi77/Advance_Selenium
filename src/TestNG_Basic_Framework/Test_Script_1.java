package TestNG_Basic_Framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Script_1 extends Base_class
{
	@Test(dataProvider ="RegisterCred",dataProviderClass = DataClass.class)
	public static void Register(String name,String last,String email,String pass) throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys(name);
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys(last);
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(pass);
		Thread.sleep(3000);
		driver.findElement(By.name("register-button")).click();
	}

}
