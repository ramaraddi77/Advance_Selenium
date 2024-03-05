package Yahoo_Basic_frame;

import org.testng.annotations.DataProvider;

public class Data_provider 
{
   @DataProvider(name = "YahooLoginCred")
   public static String[][] getdata()
   {
	   String[][]A= {{"ramaraddibg","9972149415","bgramaraddi@yahoo.com","selenium","hello sir"}};
	   return A;
   }
}
