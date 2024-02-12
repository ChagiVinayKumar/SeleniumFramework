package Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObjects.GoogleSearchPage;

public class ExtentReportsforTestNG {

	ExtentReports extent;
	ExtentSparkReporter spark;
	private static WebDriver driver=null;
	private static WebElement element = null;
	@BeforeSuite
	public void setUp() {

		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);

	}

	@Test
	public void test1() {
		ExtentTest test1 = extent.createTest("Test1","Test 1 Description");
		test1.log(Status.INFO, "Test1 info");
		test1.pass("Test1 pass");
		
		
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		driver.get("https://www.google.com/");
		test1.pass("Navigated to google.com");
				
		element = GoogleSearchPage.textbox_search(driver);
		
		element.sendKeys("Automation step by Step");
		test1.pass("Entered text in search box");
		
		element.sendKeys(Keys.RETURN);
		test1.pass("Pressed Enter");
		
		//driver.wait(10);
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
		test1.pass("Closed Browser");
		test1.log(Status.INFO, "Test Completed");
	}

	@Test
	public void test2() {
		ExtentTest test2 = extent.createTest("Test2","Test 2 Description");
		test2.log(Status.INFO, "Test1 info");
		test2.pass("Test2 pass");
		test2.fail("test 2 failed");
	}



	@AfterSuite
	public void tearDown() {
		extent.flush();
	}

}
