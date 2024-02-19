package integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Trips_4_Test {
	@Test
	
public void pondicherry()  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.incredibleindia.org/content/incredible-india-v2/en/destinations/puducherry.html");
		driver.quit();
	}

}
