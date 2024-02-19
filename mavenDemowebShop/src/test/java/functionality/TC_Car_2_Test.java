package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Car_2_Test {
	@Test
	public void brently()  {
		
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bentleymotors.com/en.html");
	driver.quit();

	
	}
}
