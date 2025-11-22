package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook2 
{
	@Test
	public void TC2()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("**************Maven Run fail TC************");
		Assert.fail();
	}
}
