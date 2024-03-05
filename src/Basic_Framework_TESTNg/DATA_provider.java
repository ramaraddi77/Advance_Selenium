package Basic_Framework_TESTNg;

import org.testng.annotations.DataProvider;

public class DATA_provider 
{
@DataProvider(name = "logincredentials")
public  static String[][] login()
{
	String[][]A= {{"9632092368","ramaraddi@66"}};
	return A;
}
@DataProvider(name = "flipkart")
public static String[][] flipkart()
{
	String[][]A= {{"puma sports shoes for men","1500"}};
	return A;
}
}
