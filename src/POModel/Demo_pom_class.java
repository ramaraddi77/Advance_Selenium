package POModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_pom_class 
{
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	@FindBy(id = "gender-male")
	private WebElement male;
	@FindBy(id = "gender-female")
	private WebElement female;
	@FindBy(id = "FirstName")
	private WebElement Ft;
	@FindBy(id = "LastName")
	private WebElement Lt;
	@FindBy(id = "Email")
	private WebElement email;
	@FindBy(id = "Password")
	private WebElement pass;
	@FindBy(id = "ConfirmPassword")
	private WebElement cpass;
	@FindBy(id = "register-button")
	private WebElement Rbutton;

	public Demo_pom_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void register()
	{
		register.click();
	}
	public void maleradio()
	{
		male.click();
	}
	public void First(String first)
	{
		Ft.sendKeys(first);
	}
	public void Last(String last)
	{
		Lt.sendKeys(last);
	}
	public void email(String email)
	{
		this.email.sendKeys(email);
	}
	public void Pass(String pass)
	{
		this.pass.sendKeys(pass);
	}
	public void Cpass(String cpass)
	{
		this.cpass.sendKeys(cpass);
	}
	public void regbutton()
	{
		Rbutton.click();
	}

}
