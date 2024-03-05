package TESTNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_class 
{
  @DataProvider(name = "fetchdata")
  public String[][] data()
  {
	  String[][]A= {{"ram","raddi"},{"raddi","ram"}};
	  return A;
  }
  @Test(dataProvider = "fetchdata")
  public void getdata(String un,String pass)
  {
	  System.out.println(un+" "+pass);
  }
}
