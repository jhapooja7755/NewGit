package pooja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumTestng {

	@Test(priority=2)
		
	public void launchBrowser()
	{
		System.out.println("hi");

	}
	@Test(priority=1)
	
	public void showMethod()
	{
		System.out.println("hello");
		Reporter.log("abcdefgh");

	}
	@Test
	@Parameters({"x1","x2"})
	public void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	@Test(groups= {"demo"})
	@Parameters({"x1","x2"})
	public void diff(int a,int b)
	{
		int diff=a-b;
		System.out.println(diff);
	}
	@Test(groups= {"demo1"})
	@Parameters({"x1","x2"})
	public void mul(int a,int b)
	{
		int mul=a*b;
		System.out.println(mul);
	}
}


