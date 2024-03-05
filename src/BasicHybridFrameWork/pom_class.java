package BasicHybridFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class
{
	@FindBy(xpath ="//button[text()='✕']")
	private WebElement ex;
	
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	private WebElement search_field;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement search_icon;
	
	@FindBy(xpath = "//span[text()='Price']/../../following-sibling::div[3]/div[1]/select")
	private WebElement min_dropdown;
	
	@FindBy(xpath = "//div[text()='Customer Ratings']/../following-sibling::div[1]/div[1]/div[1]/div[1]/label")
	private WebElement ratings;
	
	@FindBy(xpath = "(//a[contains(text(),'Dwane Running Shoes For Men')])[1]")
	private WebElement product;
	
	@FindBy(xpath = "(//a[contains(text(),'Dwane Running Shoes For Men')])[1]/../a/div[1]/div[1]")
	private WebElement product_price;
	
	
	
	public pom_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public  WebElement cancelbutton()
	{
		return ex;
	}
	public WebElement searchfield()
	{
		return search_field;
	}
	public WebElement searchicon()
	{
		return search_icon;
	}
	public WebElement dropdown()
	{
		return min_dropdown;
	}
	public WebElement ratings()
	{
		return ratings;
	}
	public WebElement product()
	{
		return product;
	}
	public WebElement price()
	{
		return product_price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
