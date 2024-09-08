package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1_Chrome {
	WebDriver driver;
  @Test
  public void setup_Chrome() throws InterruptedException {
	driver=new ChromeDriver();
	//Goto test url
	driver.get("https://www.selenium.dev");
	Thread.sleep(5000);
	//Close the Browser
	driver.close();
  }
}
