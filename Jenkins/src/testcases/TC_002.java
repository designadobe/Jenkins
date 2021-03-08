package testcases;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class TC_002 
{
	@Test
	public void tc002()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Users\\HP\\eclipse-workspace\\.metadata\\Jenkins\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
	}
}