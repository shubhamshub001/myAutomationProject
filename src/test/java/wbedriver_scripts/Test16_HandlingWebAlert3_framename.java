
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
import org.openqa.selenium.edge.EdgeDriver;

public class Test16_HandlingWebAlert3_framename {
	
	public static void main(String[] args) throws InterruptedException 	{
// TC1: Launch Chrome Browser 
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");		
		WebDriver driver=new EdgeDriver();
		
// TC2: Goto Test URL	https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//Wait Time 5 Sec 1se=1000ms 
		Thread.sleep(5000);
//	TC3: manage the browser window to minimized -Minimize Browser Window
		driver.manage().window().maximize();
		//Wait Time 3 Sec 1se=1000ms 
				Thread.sleep(5000);
				
				
	//To perform operation on an element which is inside a frame, we have to switch into that frame
				driver.switchTo().frame("iframeResult");
				//TC4: Click on the Button alert
    driver.findElement(By.xpath("//button[text()='Try it']")).click();
  
		Thread.sleep(5000);	
		
	//send data into alert
		driver.switchTo().alert().sendKeys("bhanu");

		Thread.sleep(5000);	
	//Accept the alert
		driver.switchTo().alert().accept();

		Thread.sleep(5000);			
// TC7: Close the Browser
		driver.close();
		
	}

}
