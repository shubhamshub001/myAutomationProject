
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test22_ActionsEx3 {
	
	public static void main(String[] args) throws InterruptedException 	{
// TC1: Launch Chrome Browser 	
		WebDriver driver=new ChromeDriver();
		
// TC2: Goto Test URL	http://only-testing-blog.blogspot.com/2014/09/selectable.html
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		
		//Wait Time 5 Sec 1se=1000ms 
		Thread.sleep(5000);

//	TC4: manage the browser window to maximize -  Maximize Browser Window 		
		driver.manage().window().maximize();
		//Wait Time 3 Sec 1se=1000ms 
		Thread.sleep(3000);
//Double click on Button
		WebElement doubleclickbttn=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions a=new Actions(driver);
		//a.doubleClick(doubleclickbttn).build().perform();
		a.contextClick(doubleclickbttn).build().perform();
		Thread.sleep(4000);
	
//Close the browser 
		driver.close();
	}

}
