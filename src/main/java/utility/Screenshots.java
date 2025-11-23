package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	
	public static void captureScreenshot(WebDriver driver, String filename) throws IOException
	{
		TakesScreenshot scrnshot=(TakesScreenshot)driver;
		
		File source = scrnshot.getScreenshotAs(OutputType.FILE);
		
		//File Dest=new File("D:\\Screenshotss\\"+filename+".png");
		
		String path=System.getProperty("user.dir")+"\\Screenshots\\"+filename+".png";
		
		File dest=new File(path);
		
		FileHandler.copy(source, dest);
		
		
		
	}
	
	

}
