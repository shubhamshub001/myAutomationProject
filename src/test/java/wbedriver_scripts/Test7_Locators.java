
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
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Test7_Locators {
	
	public static void main(String[] args) throws InterruptedException {
// TC1: Launch Chrome Browser 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
// TC2: Goto Test URL	 https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		//Wait Time 5 Sec 1se=1000ms 
		Thread.sleep(5000);
//Click on Create New Account Button
		driver.findElement(By.linkText("Create new account")).click();
	 //	object.method(Class.method("value")).method();
	  //munir.findObiri(By.phno("4343242342")).collectmoney();	
		//Wait Time 5 Sec 1se=1000ms 
				Thread.sleep(2000);
//Fill Firstname Textbox with input 
		driver.findElement(By.name("firstname")).sendKeys("bhanu");		
		Thread.sleep(5000);
//Select the Day from Day DropDown
		Select day=new Select(driver.findElement(By.name("birthday_day")));
		//day.selectByValue("15");
		day.selectByIndex(14);
		Thread.sleep(5000);
//Select the Month from Month Dropdown
		Select month=new Select(driver.findElement(By.id("month")));
		//month.selectByValue("10");
		//month.selectByIndex(9);
		month.selectByVisibleText("Oct");
		Thread.sleep(5000);
//Click on Male Radio Button
		//driver.findElement(By.name("sex")).click();
//below()		
		By maleRB=RelativeLocator.with(By.tagName("input")).below(By.id("month"));
		driver.findElement(maleRB).click();
		Thread.sleep(5000);
//above()
		By pwdtbox=RelativeLocator.with(By.tagName("input")).above(By.id("month"));
		driver.findElement(pwdtbox).sendKeys("abc2@1234");
		Thread.sleep(5000);
//toLeftOf()
		By fmRB=RelativeLocator.with(By.tagName("input")).toLeftOf(maleRB);
		driver.findElement(fmRB).click();
		Thread.sleep(5000);
//toRightOf()
		By custRB=RelativeLocator.with(By.tagName("input")).toRightOf(maleRB);
		driver.findElement(custRB).click();
		Thread.sleep(5000);
		
	//Close Browser 
		driver.close();

		
		
	}

}
