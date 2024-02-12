package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.GoogleSearchPageActions;

public class GoogleSearchPageActionTest {

	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		googleSearchTest();
		
	}
	
	
	public static void googleSearchTest() {
		
		driver = new ChromeDriver();
		WebElement element = null;
		driver.get("https://www.google.com/");
		
		GoogleSearchPageActions searchPageObj = new GoogleSearchPageActions(driver);
		searchPageObj.setTextInSearchBox("Automation Step by Step");
		searchPageObj.clickSearchButton();
		driver.close();
		System.out.println("Test Completed");
		
	}

}
