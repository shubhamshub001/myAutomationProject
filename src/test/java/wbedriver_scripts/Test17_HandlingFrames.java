
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

public class Test17_HandlingFrames {
	
	public static void main(String[] args) throws InterruptedException 	{
// TC1: Launch Chrome Browser 
	//	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
// TC2: Goto Test URL	https://demoqa.com/frames
		driver.get("https://demoqa.com/frames");
		
		//Wait Time 5 Sec 1se=1000ms 
		Thread.sleep(5000);

//	TC4: manage the browser window to maximize -  Maximize Browser Window 		
		driver.manage().window().maximize();
		//Wait Time 3 Sec 1se=1000ms 
		Thread.sleep(3000);
		
//Switch into frame from Topwindow
	driver.switchTo().frame("frame1");
	//driver.switchTo().frame(1);
		
		Thread.sleep(4000);
//Get the text from 0th frame into console 
		String ptext1=driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]")).getText();
		System.out.println(ptext1);
		
		Thread.sleep(4000);
		
//Get text from 1st frame
		//switch from 0th frame to 1st frame
		//To switch from one frame to another frame wfirst we have to switch to default content
		driver.switchTo().defaultContent();
		//then now switch from 0th frame to 1st frame
		driver.switchTo().frame("frame2");
		
//Get the text from 1st frame into console 
				String ptext2=driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]")).getText();
				System.out.println(ptext2);		
		Thread.sleep(5000);
// TC7: Close the Browser
		driver.close();
		
	}

}
