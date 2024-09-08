
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

import java.util.ArrayList;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11_HandlingTabs {
	
	public static void main(String[] args) throws InterruptedException {
// TC1: Launch Chrome Browser 
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
// TC2: Goto Test URL	 https://demoqa.com/browser-windows
		driver.get("https://demoqa.com/browser-windows");
		
		//Wait Time 5 Sec 1se=1000ms 
		Thread.sleep(5000);
//Maximize Browser window
	driver.manage().window().maximize();	
		//click on newtab button
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(5000);
	//Handle Tabs
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs);
		Thread.sleep(5000);
	//Switch from 0th tab to 1st tab
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		//Get the plain text into console
		String ptext=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(ptext);
		
	//Close 1st tab 
		driver.close();
	//switch from 1st tab to 0th tab
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(5000);
	//Close 0th tab
		driver.close();
		
		
	}

}
