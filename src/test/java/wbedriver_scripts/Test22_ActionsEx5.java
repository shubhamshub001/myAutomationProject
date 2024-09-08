
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

public class Test22_ActionsEx5 {
	
	public static void main(String[] args) throws InterruptedException 	{
// TC1: Launch Chrome Browser 	
		WebDriver driver=new ChromeDriver();
		
// TC2: Goto Test URL	 https://demoqa.com/droppable
		driver.get("https://demoqa.com/droppable");
		
		//Wait Time 5 Sec 1se=1000ms 
		Thread.sleep(5000);

//	TC4: manage the browser window to maximize -  Maximize Browser Window 		
		driver.manage().window().maximize();
		//Wait Time 3 Sec 1se=1000ms 
		Thread.sleep(3000);
//Double click on Button
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a=new Actions(driver);
		//a.doubleClick(doubleclickbttn).build().perform();
		//a.contextClick(doubleclickbttn).build().perform();
		//a.dragAndDropBy(slider, 50, 0).build().perform();
		a.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(4000);
	
//Close the browser 
		driver.close();
	}

}
