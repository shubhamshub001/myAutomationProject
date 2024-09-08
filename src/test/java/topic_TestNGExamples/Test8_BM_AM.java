package topic_TestNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test8_BM_AM {
	public  WebDriver driver;
 @BeforeMethod
  public void setup() {
	  driver=new ChromeDriver();
  }
  
 @AfterMethod
  public void tearDown()
  {
	  driver.close();
  }
  
 @Test(priority=1)
 public void verifySDPage() throws InterruptedException
 {
	 driver.get("https://www.saucedemo.com/");
	 Thread.sleep(5000);
	 String ExpTitle="Swag Labs";
	 String ActTitle=driver.getTitle();
	 Assert.assertEquals(ActTitle, ExpTitle);
	 
 }
 @Test(priority=2)
 public void verifyGooglePage() throws InterruptedException
 {
	 driver.get("https://www.google.com/");
	 Thread.sleep(5000);
	 String ExpTitle="Google";
	 String ActTitle=driver.getTitle();
	 Assert.assertEquals(ActTitle, ExpTitle);
	 
 }
 @Test(priority=3)
 public void verifyBhanuSaiiPage() throws InterruptedException
 {
	 driver.get("https://bhanusaii.wordpress.com/");
	 Thread.sleep(5000);
	 String ExpTitle="Bhanu Sai – “Learning gives creativity Creativity leads to thinking Thinking provides knowledge Knowledge makes you great.”";
	 String ActTitle=driver.getTitle();
	 Assert.assertEquals(ActTitle, ExpTitle);
	 
 }
}
