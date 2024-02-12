package Tests;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageObjects.GoogleSearchPage;

public class ExtentReportsBasicDemo {

	private static WebDriver driver=null;
	private static WebElement element = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
		ExtentTest test = extent.createTest("Google Search Test1","This is a test to validate");
        
		driver = new ChromeDriver();
		
		test.log(Status.INFO, "Starting Test Case");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
				
		element = GoogleSearchPage.textbox_search(driver);
		
		element.sendKeys("Automation step by Step");
		test.pass("Entered text in search box");
		
		element.sendKeys(Keys.RETURN);
		test.pass("Pressed Enter");
		
		//driver.wait(10);
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
		test.pass("Closed Browser");
		test.log(Status.INFO, "Test Completed");
		
		driver = new ChromeDriver();
		element = null;
		ExtentTest test1 = extent.createTest("Google Search Test2","This is a test to validate");
        
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
		test1.fail("Closed Browser");
		test.log(Status.INFO, "Test Completed");
		
		
		extent.flush();
	}

}
