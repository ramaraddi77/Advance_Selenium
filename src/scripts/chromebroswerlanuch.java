package scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromebroswerlanuch {
public static void main(String[]args) {
	String key="webdriver.chrome.driver";
	String value="./Additional SW/chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver driver=new ChromeDriver();
}
}
