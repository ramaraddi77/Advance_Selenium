package TESTNG;

import org.testng.annotations.Test;

public class Get_data 
{
		@Test(dataProvider = "savedata",dataProviderClass = DataClass.class)
		public static void getdata(String a,String b)
		{
			System.out.println(a+" "+b);
		}
	}