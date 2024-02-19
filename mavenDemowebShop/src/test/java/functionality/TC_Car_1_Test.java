package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Car_1_Test {
	
	@Test
	
	public void Audi()  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.audi.in/in/web/en.html");
		driver.quit();
		
	}

}
