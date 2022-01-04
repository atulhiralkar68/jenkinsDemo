package contacts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001Test {

	public void createAccount(){
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome browser is launched successfully");
		driver.manage().window().maximize();
		System.out.println("browser window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Step 2: enter the valid url
		driver.get("https://demo.actitime.com/login.do");
		
		
	}

}
