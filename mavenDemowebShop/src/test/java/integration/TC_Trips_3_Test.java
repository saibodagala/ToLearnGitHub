package integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Trips_3_Test {
	@Test
	
public void ooty()  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tamilnadutourism.tn.gov.in/destinations/ooty");
		driver.quit();
	}


}
