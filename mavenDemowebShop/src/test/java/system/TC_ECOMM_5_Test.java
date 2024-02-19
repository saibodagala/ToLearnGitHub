package system;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_ECOMM_5_Test {
	
	@Test
	
public void  rarerabbit() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thehouseofrare.com/");
		driver.quit();
	}

}
