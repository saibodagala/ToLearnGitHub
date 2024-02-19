package integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Trips_2_Test {
	@Test
	
	public void goa()  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://goa-tourism.com/");
		driver.quit();
	}

}
