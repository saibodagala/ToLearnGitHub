package system;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_ECOMM_4_Test {
	@Test
	
public void  zara() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zara.com/in/");
		driver.quit();
	}

}
