package browser.Edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test1_Edge {
	WebDriver driver;
  @Test
  public void setup_Edge() throws InterruptedException {
	  
	  driver=new EdgeDriver();
		//Goto test url
		driver.get("https://www.selenium.dev");
		Thread.sleep(5000);
		//Close the Browser
		driver.close();
		
  }
}
