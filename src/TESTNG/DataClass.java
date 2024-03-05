package TESTNG;

import org.testng.annotations.DataProvider;

public class DataClass
{
  @DataProvider(name = "savedata")
  public static String[][] data()
  {
	  String[][]Arr= {{"ram","raddi"},{"raddi","ram"}};
	  return Arr;
  }
}
