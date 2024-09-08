
/* Test Scenario
 ***********
 TC1: Launch Chrome Browser 
 TC2: Goto Test URL 
 TC3: Minimize Browser Window
 TC4: Maximize Browser Window 
 TC5: Get the Title of the Page
 TC6: Get the Current URL of the Page 
 TC7: Close the Browser */

package topic_TestNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7_VP6 {
	
	public WebDriver driver;
	
	//public static void main(String[] args) throws InterruptedException 	{

	@Test(priority=0)	
	public void setup() throws InterruptedException
	{
		
		//TC:1 Launch Chrome Browser 
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
	}
	
@Test(priority=1)
public void gotoURL() throws InterruptedException
{
//TC:2 Goto Test URL https://www.selenium.dev/
		driver.get("https://www.selenium.dev/");
		Thread.sleep(5000);
}
@Test(priority=2)
public void verifySeleniumPage()
{
//TC:6 Verify Login
				
	String ExpText="Selenium automates browsers. That's it!";
	String ActText=driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates')]")).getText();
	System.out.println(ActText);
				  if(ActText.equals(ExpText)) 
				  {
				  System.out.println("Test Passed - Launched Selenium Page "); 
				  } else
				  {
				  System.out.println("Test Failed - Launched some other page"); 
				  }
				 
				//Assert.assertEquals(ActualURL, ExpectedURL);
}

//TC:7 Close the Browser
@Test(priority=3)
public void teardown()
{
	
				driver.close();
}

}
