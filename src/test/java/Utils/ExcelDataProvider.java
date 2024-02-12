package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Config.PropertiesFile;

public class ExcelDataProvider {
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest()
	{
		
			driver = new ChromeDriver();
		
	}
	
	@Test(dataProvider="test1data")
	public void test1(String username,String password) throws InterruptedException {
		System.out.println(username+" | "+password);
		driver.get("https://support.orangehrm.com/portal/en/signin");
		Thread.sleep(3000);
		driver.switchTo().frame("iamFrame");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
		Thread.sleep(3000);
		
		
		
	}
	
	@DataProvider(name= "test1data")
	public Object[][] getData() {
		Object data[][]= testData("TestDataSheet2.xlsx","Sheet1");
		return data;
	}
	
	
	public Object[][] testData(String excelname, String sheetname) {
		ExcelUtils excel = new ExcelUtils(excelname, sheetname);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColumnCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for (int i=1; i<rowCount; i++)
		{
			for (int j=0;j<colCount;j++)
			{
				String celldata= excel.getCelldataString(i,j);
				//System.out.print(celldata+" | ");
				data[i-1][j]= celldata;
			}
			System.out.println();
		}
		return data;
	}
}
