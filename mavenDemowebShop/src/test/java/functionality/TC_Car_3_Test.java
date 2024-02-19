package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Car_3_Test {
	
	@Test
	
	public void rollsroyce()  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
		driver.quit();
		
	}

}
