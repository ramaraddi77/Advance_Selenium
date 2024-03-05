package TestNG_Basic_Framework;

import org.testng.annotations.DataProvider;

public class DataClass
{
	@DataProvider(name = "RegisterCred")
	public static String[][] Getdata()
	{
      String[][]A= {{"ram","Bg","ramaradd21@gmail.com","9632092368"},{"RAM","BG","ramaraddi61@gmail.com","9945212177"}};
      return A;
	}
}
