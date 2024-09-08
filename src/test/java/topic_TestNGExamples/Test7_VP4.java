
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

public class Test7_VP4 {
	
	public WebDriver driver;
	
	//public static void main(String[] args) throws InterruptedException 	{

@Test(priority=1)
public void gotoURL() throws InterruptedException
{
//TC:2 Goto Test URL https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
}
@Test(priority=2)
public void type_UserName() throws InterruptedException
{
//TC:3 Fill Username textbox with input 
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
}

@Test(priority=3)
public void type_Password() throws InterruptedException 
{
//TC:4 Fill Password textbox with input 
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret");
				Thread.sleep(5000);
}
@Test(priority=0)	
public void setup() throws InterruptedException
{
	
	//TC:1 Launch Chrome Browser 
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
}
@Test(priority=4)
public void click_Login() throws InterruptedException
{
//TC:5 Click on Login Button
				driver.findElement(By.xpath("//input[@name='login-button']")).click();
				Thread.sleep(5000);
}
@Test(priority=5)
public void verifyErrorMsg()
{
//TC:6 Verify Login
				
	String ExpErrMsg="Epic sadface:";
	String ActErrMsg=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface')]")).getText();
	System.out.println(ActErrMsg);
				  if(ActErrMsg.contains(ExpErrMsg)) 
				  {
				  System.out.println("Test Passed - Valid Error Message Displayed"); 
				  } else
				  {
				  System.out.println("Test Failed - InValid Error Message Displayed"); 
				  }
				 
				//Assert.assertEquals(ActualURL, ExpectedURL);
}

//TC:7 Close the Browser
@Test(priority=6)
public void teardown()
{
	
				driver.close();
}

}
