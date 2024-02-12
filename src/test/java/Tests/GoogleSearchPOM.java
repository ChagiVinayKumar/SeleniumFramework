package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.GoogleSearchPage;

public class GoogleSearchPOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		WebElement element = null;
		driver.get("https://www.google.com/");
		
		
		//driver.findElement(By.id("APjFqb")).sendKeys("Automation step by Step");
		
		element = GoogleSearchPage.textbox_search(driver);
		element.sendKeys("Automation step by Step");
		element.sendKeys(Keys.RETURN);
		//driver.wait(10);
		driver.close();
		System.out.println("Test Completed");
		
	}

}
