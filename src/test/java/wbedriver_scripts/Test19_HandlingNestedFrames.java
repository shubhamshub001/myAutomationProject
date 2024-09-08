
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

public class Test19_HandlingNestedFrames {
	
	public static void main(String[] args) throws InterruptedException 	{
// TC1: Launch Chrome Browser 
	//	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
// TC2: Goto Test URL	https://demoqa.com/nestedframes
		driver.get("https://demoqa.com/nestedframes");
		
		//Wait Time 5 Sec 1se=1000ms 
		Thread.sleep(5000);

//	TC4: manage the browser window to maximize -  Maximize Browser Window 		
		driver.manage().window().maximize();
		//Wait Time 3 Sec 1se=1000ms 
		Thread.sleep(5000);
		
	//switch to PARENT  frame 
		driver.switchTo().frame("frame1");
		Thread.sleep(5000);
	//fill customer id in textbox
		String ptext1=driver.findElement(By.xpath("//*[text()='Parent frame']")).getText();
System.out.println(ptext1);
		Thread.sleep(5000);
		
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		String ptext2=driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(ptext2);
		Thread.sleep(5000);
// TC7: Close the Browser
		driver.close();
		
	}

}
