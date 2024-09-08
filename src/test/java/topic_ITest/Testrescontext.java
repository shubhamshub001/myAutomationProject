package topic_ITest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testrescontext {
	WebDriver driver;
  @BeforeMethod
  public void setup(ITestContext testcontext) throws InterruptedException {
	  
	  System.out.println("My setup methods");
	  String Browser=testcontext.getCurrentXmlTest().getParameter("browser");
	  if(Browser.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(Browser.equals("edge"))
	  {
	  driver=new EdgeDriver();
	  }

	  else if(Browser.equals("ff"))
	  {
	  driver=new FirefoxDriver();
	  }	 
  }
  
  @AfterMethod
  public void tearDown()
  {
	  
	  //close the browser
	  driver.close(); 
  }
  @Test
  public void sdPage() throws InterruptedException
  {
	  //Goto Test URL
	  driver.get("https://www.saucedemo.com/");
	  Thread.sleep(5000);  
  }
  
}
