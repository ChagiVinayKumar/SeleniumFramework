package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.GoogleSearchPageActions;

public class GoogleSearchPageActionTestNG {

	
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest()
	{
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void googleSearchTest() throws InterruptedException {
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
		driver.quit();
		System.out.println("Test Completed");
		
	}

}
