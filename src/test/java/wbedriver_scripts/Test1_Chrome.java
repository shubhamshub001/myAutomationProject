
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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_Chrome {
	
	public static void main(String[] args) throws InterruptedException 	{
// TC1: Launch Chrome Browser 	
		WebDriver driver=new ChromeDriver();
		
// TC2: Goto Test URL	https://www.selenium.dev/
		driver.get("https://www.selenium.dev/");
		
		//Wait Time 5 Sec 1se=1000ms 
		Thread.sleep(5000);
//	TC3: manage the browser window to minimized -Minimize Browser Window
		driver.manage().window().minimize();
		//Wait Time 3 Sec 1se=1000ms 
				Thread.sleep(3000);
//	TC4: manage the browser window to maximize -  Maximize Browser Window 		
		driver.manage().window().maximize();
		//Wait Time 3 Sec 1se=1000ms 
		Thread.sleep(3000);
		
//TC5: Get the Title of the Page
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		System.out.println("pageTitle");
		//Wait Time 3 Sec 1se=1000ms 
		Thread.sleep(3000);
// TC6: Get the Current URL of the Page 
		String pageURL=driver.getCurrentUrl();
		System.out.println(pageURL);
		Thread.sleep(3000);
// TC7: Close the Browser
		driver.close();
		
	}

}
