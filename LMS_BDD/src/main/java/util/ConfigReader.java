package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	
	//This method is used to load the properties from config.properties file
	public Properties init_prop() 
	{
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\sath1\\eclipse-workspace\\LMS_BDD\\src\\test\\resources\\config\\Config,Properties");
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return prop;
	}
}
