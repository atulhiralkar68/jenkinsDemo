package contacts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_CreateAcc_003 {
	
	@Test
	public void createAcc() {
	
		Reporter.log("From Create Account", true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.close();
	}

}
