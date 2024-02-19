package integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Trips_1_Test {
	@Test
	
	public void nandihills() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thrillophilia.com/attractions/nandi-hills");
		driver.quit();
	}

}
