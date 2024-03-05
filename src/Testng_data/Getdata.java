package Testng_data;

import org.testng.annotations.Test;

import TESTNG.DataClass;

public class Getdata 
{
	@Test(dataProvider = "savedata",dataProviderClass = DataClass.class)
	public static void getdata(String a,String b)
	{
		System.out.println(a+" "+b);
	}
}
