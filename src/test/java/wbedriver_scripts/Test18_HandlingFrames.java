
/* Test Scenario
 ***********
 TC1: Launch Chrome Browser 
 TC2: Goto Test URL 
 TC3: Minimize Browser Window
 TC4: Maximize Browser Window 
 TC5: Get the Title of the Page
 TC6: Get the Current URL of the Page 
 TC7: Close the Browser */

package wbedriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18_HandlingFrames {
	
	public static void main(String[] args) throws InterruptedException 	{
// TC1: Launch Chrome Browser 
	//	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
// TC2: Goto Test URL	https://netbanking.hdfcbank.com/netbanking/
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//Wait Time 5 Sec 1se=1000ms 
		Thread.sleep(5000);

//	TC4: manage the browser window to maximize -  Maximize Browser Window 		
		driver.manage().window().maximize();
		//Wait Time 3 Sec 1se=1000ms 
		Thread.sleep(5000);
		
	//switch to 0th frame 
		driver.switchTo().frame(0);
		Thread.sleep(5000);
	//fill customer id in textbox
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("abdc");

		Thread.sleep(5000);
		
	//click on knowmore link
		driver.findElement(By.xpath("(//a[contains(text(),'Know')])[2]")).click();
		Thread.sleep(5000);
// TC7: Close the Browser
		driver.close();
		
	}

}
