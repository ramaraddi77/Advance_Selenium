package scripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbroswerlaunch {
public static void main(String[]args)
{
	String key="webdriver.gecko.driver";
	String value="./Additional SW/geckodriver.exe";
	System.setProperty(key, value);
	FirefoxDriver driver=new FirefoxDriver();
}
}