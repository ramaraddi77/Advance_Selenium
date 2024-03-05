package PropertyFile;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("on start");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("on success");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("on failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Started");
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("Finished");
	}

}
