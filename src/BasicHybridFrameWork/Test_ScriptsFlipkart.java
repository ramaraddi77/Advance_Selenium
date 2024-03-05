package BasicHybridFrameWork;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Basic_Framework_TESTNg.DATA_provider;

public class Test_ScriptsFlipkart extends Base_class
{
	@Test(dataProvider = "flipkart",dataProviderClass = DATA_provider.class)
	public void testSCriptflipkart(String proname,String price) throws InterruptedException, AWTException
	{
		pom_class pmc=new pom_class(driver);
		pmc.cancelbutton().click();
		Thread.sleep(1500);
		pmc.searchfield().sendKeys(proname);
		Thread.sleep(1500);
		pmc.searchicon().click();
		Thread.sleep(1500);
		Select sel=new Select(pmc.dropdown());
		Thread.sleep(1500);
		sel.selectByValue(price);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1500);
		Point loc = pmc.ratings().getLocation();
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1500);
		pmc.ratings().click();
		Thread.sleep(1500);
		Point location = pmc.product().getLocation();
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(1500);
		String text = pmc.price().getText();
		Thread.sleep(1500);
		System.out.println(text);	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
