
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

public class Test22_ActionsEx1 {
	
	public static void main(String[] args) throws InterruptedException 	{
// TC1: Launch Chrome Browser 	
		WebDriver driver=new ChromeDriver();
		
// TC2: Goto Test URL	https://www.flipkart.com/
		driver.get("https://www.flipkart.com/");
		
		//Wait Time 5 Sec 1se=1000ms 
		Thread.sleep(5000);

//	TC4: manage the browser window to maximize -  Maximize Browser Window 		
		driver.manage().window().maximize();
		//Wait Time 3 Sec 1se=1000ms 
		Thread.sleep(3000);
//Close login
		driver.findElement(By.xpath("//label[contains(text(),'Enter Email')]/preceding::*[6]")).click();
		Thread.sleep(3000);
//Move mouse towards fashion
		WebElement fashion=driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions a=new Actions(driver);
		a.moveToElement(fashion).build().perform();
		Thread.sleep(3000);
//Move mouse towards Womenethnic
		WebElement womenethnic=driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
		a.moveToElement(womenethnic).build().perform();
		Thread.sleep(3000);
//click on women sarees
		driver.findElement(By.xpath("//a[text()='Women Sarees']")).click();
		Thread.sleep(4000);
//Close the browser 
		driver.close();
	}

}
