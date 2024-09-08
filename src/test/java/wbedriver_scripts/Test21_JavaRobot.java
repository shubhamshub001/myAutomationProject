
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

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21_JavaRobot {
	
	public static void main(String[] args) throws InterruptedException, AWTException 	{
// TC1: Launch Chrome Browser 		
		WebDriver driver=new ChromeDriver();
		
// TC2: Goto Test URL	https://smallpdf.com/word-to-pdf#r=convert-to-word
		driver.get("https://smallpdf.com/word-to-pdf#r=convert-to-word");
		
		//Wait Time 5 Sec 1se=1000ms 
		Thread.sleep(5000);

//	TC4: manage the browser window to maximize -  Maximize Browser Window 		
		driver.manage().window().maximize();
		//Wait Time 3 Sec 1se=1000ms 
		Thread.sleep(3000);

		

		//Implement Java Robot to Handle window Alert 
		Robot r=new Robot();
		//Scroll One Step Down
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		//scroll one step to top
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
		//Scroll to bottom
		r.keyPress(KeyEvent.VK_END);
		r.keyRelease(KeyEvent.VK_END);
		Thread.sleep(5000);
		//Scroll to Top
		r.keyPress(KeyEvent.VK_HOME);
		r.keyRelease(KeyEvent.VK_HOME);
		Thread.sleep(5000);
		//Open a New Tab
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		//Goto Test URL
		driver.navigate().to("https://www.bhanusaii.wordpress.com");
		Thread.sleep(5000);
		//Close the Tab
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		//Create a New Window
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		//Close the Browser
		driver.quit();
		
		
		
		
	}

}
