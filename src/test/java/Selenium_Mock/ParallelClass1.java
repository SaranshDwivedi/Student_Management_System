package Selenium_Mock;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelClass1
{
	@Test
	public void test3()
	{
		Reporter.log("test 3", true);
	}
	
	@Test
	public void test4()
	{
		Reporter.log("test 4", true);
	}
}
