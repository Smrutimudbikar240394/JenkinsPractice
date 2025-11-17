package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class FacebookPage 
{
	@Test
	public void TC1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("**************Maven Run************");
	}

}
