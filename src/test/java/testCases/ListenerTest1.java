package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

public class ListenerTest1 
{
	

	
		
		static WebDriver driver;
		
		
		@Description("Login Functionality Test")
		@Epic("Epic_001")
		@Feature("Feature_001: Login Test")
		@Step("Step_001: Enter Username and Password")
		
	      @Test(priority=1)
	      
		public void login() throws InterruptedException
		{
			
	     driver  = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			
			driver.findElement(By.name("password")).sendKeys("admin13");
			
			driver.findElement(By.xpath("//*[text()=' Login ']")).click();
			
			Thread.sleep(3000);
			
			WebElement message = driver.findElement(By.xpath("//*[text()='Invalid credentials']"));
			
			String actualmsg = message.getText();
			
			String expectedmsg="Invalid dredentials";

			
			Assert.assertEquals(actualmsg, expectedmsg);
				
			
			
		}
	      
	      @Test(priority=2,dependsOnMethods="login")
	      
	      public void homepage()
	      {
	    	  
	    	  System.out.println("this is test case 2");
	    	  
	      }
		
	      
	      @Test(priority=3)
	      
	      public void profile()
	      {
	    	  
	    	  System.out.println("this is test case 3");
	      }
		
	      @AfterMethod()
	      public void tearDown(ITestResult result)
	      {
	    	  if(result.getStatus()==ITestResult.FAILURE)
	    	  {
	    		  
	    		  utility.ScreenshotAllure.attachScreenshot(driver);
	    		  
	    	  }
	    	  
	    	 
	    	  
	      }
		
		

	




}
