package TESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgbasic
{
@Test(priority = 1,invocationCount = 4)
public void signup()
{
	Reporter.log("create an accoun");
	Assert.fail();
}

@Test(priority = 2,dependsOnMethods = "signup")
public void login()
{
Reporter.log("logged in successfully");
}

@Test(priority = 3)
public void logout()
{
	Reporter.log("logged out");
}
}
