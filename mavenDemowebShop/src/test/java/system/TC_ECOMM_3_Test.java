package system;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_ECOMM_3_Test {
	@Test
	
public void  hm() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www2.hm.com/en_in/index.html");
		driver.quit();
	}

}
