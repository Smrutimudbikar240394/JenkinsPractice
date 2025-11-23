package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	
	
	public static String readInfo(String keyvalue) throws IOException
	{
		
      FileInputStream fis=new FileInputStream("C:\\Users\\91702\\New Workspace\\seleniumPractise\\config.properties");
		
		
		Properties pro = new Properties();
		
		pro.load(fis);
		
		String prop = pro.getProperty(keyvalue);
		
		return prop;
		
		
		
	}

}
