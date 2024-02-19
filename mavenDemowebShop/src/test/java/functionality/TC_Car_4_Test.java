package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Car_4_Test {
	
	@Test
	
	public void jeep() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jeep-india.com/wrangler-jl.html");
		driver.quit();
	}
	
	
	

}
