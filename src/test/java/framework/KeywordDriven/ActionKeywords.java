package framework.KeywordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActionKeywords {
	public static WebDriver driver;
	
	@Test(priority=0)
	public static void openBrowser()
	{
		driver=new ChromeDriver();
	}
	
	@Test(priority=1)
	public static void navigate()
	{
		//TC:2 Goto Test URL https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority=2)
	public static void inputUserName() throws InterruptedException
	{
		//TC:3 Fill Username textbox with input 
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
	}

	@Test(priority=3)
	public static void inputPassword() throws InterruptedException
	{
	//TC:4 Fill Password textbox with input 
					driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
					Thread.sleep(5000);
	}
	
	@Test(priority=4)
	public static void clickSigin() throws InterruptedException
	{
	//TC:5 Click on Login Button
					driver.findElement(By.xpath("//input[@name='login-button']")).click();
					Thread.sleep(5000);
	}

	@Test(priority=5)
	public static void closeBrowser()
	{
		driver.close();
	}
	
}
