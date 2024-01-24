package Selenium_Mock;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelClass{

	@Test
	public void test1()
	{
		Reporter.log("test 1 Executed", true);
	}
	
	@Test
	public void test2()
	{
		Reporter.log("Test 2 executed", true);
	}
}
