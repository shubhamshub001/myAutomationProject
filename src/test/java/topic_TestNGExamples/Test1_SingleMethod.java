
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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_SingleMethod {
	
	
	//public static void main(String[] args) throws InterruptedException 	{
@Test	
public void verifySauceDemoLogin() throws InterruptedException
{
	
	//TC:1 Launch Chrome Browser 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//TC:2 Goto Test URL https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
//TC:3 Fill Username textbox with input 
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
//TC:4 Fill Password textbox with input 
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
				Thread.sleep(5000);
//TC:5 Click on Login Button
				driver.findElement(By.xpath("//input[@name='login-button']")).click();
				Thread.sleep(5000);
//TC:6 Verify Login
				String ExpectedURL="https://www.saucedemo.com/inventory.html";
				String ActualURL=driver.getCurrentUrl();
				if(ActualURL.equals(ExpectedURL))
				{
					System.out.println("Test Passed - Login Success");
				}
				else
				{
					System.out.println("Test Failed - Login Failed");
				}
//TC:7 Close the Browser
				driver.close();
	}

}
