package Selenium_Mock;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelClass2 {
	@Test
	public void test5()
	{
		Reporter.log("test 5", true);
	}
	
	@Test
	public void test6()
	{
		Reporter.log("test 6", true);
	}
}
