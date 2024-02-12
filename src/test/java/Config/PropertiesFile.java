package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import Tests.GoogleSearchPageActionTestNG2;

public class PropertiesFile {
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");
	public static void main(String[] args) {
		
		getProperties();
		setProperties();
		getProperties();
	}
	public static void getProperties()
	{
		
		try {
			
			FileInputStream input = new FileInputStream(projectPath+"/src/test/java/Config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			GoogleSearchPageActionTestNG2.browsername = browser;
		    } 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print("Message is: "+e.getMessage());
			System.out.println("Cause is: "+e.getCause());
			e.printStackTrace();
		}
	}
	
	public static void setProperties() {
		try {
			FileOutputStream output = new FileOutputStream(projectPath+"/src/test/java/Config/config.properties");
			prop.setProperty("browser", "Chrome");
			prop.store(output,null);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print("Message is: "+e.getMessage());
			System.out.println("Cause is: "+e.getCause());
			e.printStackTrace();
		}
		
	}
}
