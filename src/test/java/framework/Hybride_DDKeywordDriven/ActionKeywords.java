package framework.Hybride_DDKeywordDriven;

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
	public static void navigate(String url)
	{
		//TC:2 Goto Test URL https://www.saucedemo.com/
		driver.get(url);
	}
	
	@Test(priority=2)
	public static void inputUserName(String uname) throws InterruptedException
	{
		//TC:3 Fill Username textbox with input 
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		Thread.sleep(5000);
	}

	@Test(priority=3)
	public static void inputPassword(String pwd) throws InterruptedException
	{
	//TC:4 Fill Password textbox with input 
					driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
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
