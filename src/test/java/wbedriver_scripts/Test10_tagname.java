
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

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10_tagname {
	
	public static void main(String[] args) throws InterruptedException {
// TC1: Launch Chrome Browser 
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
// TC2: Goto Test URL	 https://www.selenium.dev/
		driver.get("https://www.selenium.dev/");
		
		//Wait Time 5 Sec 1se=1000ms 
		Thread.sleep(5000);

		//Get no of links and it's count
		List<WebElement> e=driver.findElements(By.tagName("span"));
		System.out.println(e.size());
		for(int i=0;i<e.size();i++)
		{
			System.out.println(e.get(i).getText());
		}
		
		
		
		
		
		Thread.sleep(5000);
		
	//Close Browser 
		driver.close();

		
		
	}

}
