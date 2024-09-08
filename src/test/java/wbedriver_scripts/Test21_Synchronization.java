
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
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test21_Synchronization {
	
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
//TC5: Click on Choose File Button
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		Thread.sleep(3000);
		

		//Path of File 
		
		
		//Load the Path of File into Clipboard 
		StringSelection s=new StringSelection("D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Test.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//Send the data from clipboard to Screen
		//Paste Operation CONTROL + V 
		//Implement Java Robot to Handle window Alert 
		Robot r=new Robot();
		//Paste 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		//ENTER
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//Java Wait
		//Thread.sleep(15000);
		//Selenium Implicit Wait 
		//driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		//Selenium Explicit Wait
		/*
		 * WebDriverWait w=new WebDriverWait(driver,100);
		 * 
		 * w.until(ExpectedConditions.
		 * invisibilityOfElementLocated(By.className("raDiv")));
		 */
		WebElement clickDownload = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Download']")));
	//Click on download button
		clickDownload.click();
		//driver.findElement(By.xpath("//span[text()='Download']")).click();
		Thread.sleep(8000);
		//Close the Browser
		driver.close();
		
		
		
		
	}

}
