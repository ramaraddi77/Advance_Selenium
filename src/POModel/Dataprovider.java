package POModel;

import org.testng.annotations.DataProvider;

public class Dataprovider
{
	@DataProvider(name="data")
	public static String[][] DATA()
	{
		String[][]A= {{"ram","BG","ramaraddi21@gmail.com","ramaraddi66"}};
		return A;
	}
}
