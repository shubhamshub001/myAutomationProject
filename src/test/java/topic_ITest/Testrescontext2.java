package topic_ITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testrescontext2 {
	WebDriver driver;
	@Parameters({"browser"})
  @BeforeMethod
  public void setup(String Browser) throws InterruptedException {
	  
	  System.out.println("My setup methods");
	  //String Browser=testcontext.getCurrentXmlTest().getParameter("browser");
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
  
  @Parameters({"username","password"})
  @Test
  public void sdPage(String uname,String pwd) throws InterruptedException
  {

	//TC:2 Goto Test URL https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
//TC:3 Fill Username textbox with input 
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		Thread.sleep(5000);
//TC:4 Fill Password textbox with input 
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
				Thread.sleep(5000);
//TC:5 Click on Login Button
				driver.findElement(By.xpath("//input[@name='login-button']")).click();
				Thread.sleep(5000);
//TC:6 Verify Login
				String ExpectedURL="https://www.saucedemo.com/inventory.html";
				String ActualURL=driver.getCurrentUrl();
				Assert.assertEquals(ActualURL, ExpectedURL);
  }
  
}
