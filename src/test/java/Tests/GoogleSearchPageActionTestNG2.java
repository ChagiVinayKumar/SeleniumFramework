package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.PropertiesFile;
import PageObjects.GoogleSearchPageActions;

public class GoogleSearchPageActionTestNG2 {

	
	static WebDriver driver = null;
	public static String browsername = null;
	
	@BeforeTest
	public void setUpTest()
	{
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if (browsername.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.out.println("Driver is firefox");
		}
	}
	
	@Test
	public void googleSearchTest1() throws InterruptedException {
		WebElement element = null;
		driver.get("https://www.google.com/");		
		GoogleSearchPageActions searchPageObj = new GoogleSearchPageActions(driver);
		searchPageObj.setTextInSearchBox("Automation Step by Step");
		//driver.manage().timeouts().wait(20);
		searchPageObj.clickSearchButton();
		//driver.manage().timeouts().wait(20);
		}
	
	@Test
	public void googleSearchTest3() throws InterruptedException {
		WebElement element = null;
		driver.get("https://www.google.com/");		
		GoogleSearchPageActions searchPageObj = new GoogleSearchPageActions(driver);
		searchPageObj.setTextInSearchBox("Automation Step by Step");
		//driver.manage().timeouts().wait(20);
		searchPageObj.clickSearchButton();
		//driver.manage().timeouts().wait(20);
		}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		//driver.quit();
		System.out.println("Test Completed");
		PropertiesFile.setProperties();
		
	}

}
