package integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Trips_5_Test {
	@Test
	
	public void AndamanIlands()  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.andamanblues.in/?gclid=Cj0KCQiAw6yuBhDrARIsACf94RWSl_PVKqrRZtZsMU4dvYgNjtkMlOCVoD0QZvFVWy9Zxbjp4j8eUusaAiKEEALw_wcB");
		driver.quit();
	}

}
