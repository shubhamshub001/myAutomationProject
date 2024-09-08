package browser.FF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1_FF {
	WebDriver driver;
  @Test
  public void setup_FF() throws InterruptedException {
	  
	  driver=new FirefoxDriver();
		//Goto test url
		driver.get("https://www.selenium.dev");
		Thread.sleep(5000);
		//Close the Browser
		driver.close();
		
  }
}
