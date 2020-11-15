	package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CostcocaHomepageValidation 
{
	public static WebDriver driver;
	
	@BeforeMethod
	
	public static void openBrowser()
	{
		System.out.println("Costcoca Homepage Launching");
		System.setProperty("webdriver.chrome.driver","C:\\Oct 2020\\Oct 2020 Projects\\costcocaValidation\\digital.net\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public static void CostcocaHompageValidation()
	{
		driver.get("https://www.costco.ca/");
	}
	
	@AfterMethod
	
	public static void closeBrowser()
	{
		//driver.close();
	}
	
	
}
