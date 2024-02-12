import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException 
	{
		googleSearch();
	}
	
		public static void googleSearch() throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.id("APjFqb")).sendKeys("Automation step by Step");
			driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
			driver.wait(10);
			driver.close();
			System.out.println("Test Completed");
		}
		
	
}
