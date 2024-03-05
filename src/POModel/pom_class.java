package POModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class 
{
	@FindBy(id="email")
	private WebElement user_name;
	@FindBy(id="pass")
	private WebElement pass_word;

	public pom_class(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void username(String un)
	{
		user_name.sendKeys(un);
	}
}
