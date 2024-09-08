
/* Test Scenario
 ***********
 TC1: Launch Chrome Browser 
 TC2: Goto Test URL 
 TC3: Minimize Browser Window
 TC4: Maximize Browser Window 
 TC5: Get the Title of the Page
 TC6: Get the Current URL of the Page 
 TC7: Close the Browser */

package topic_Sikuli;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Test1_Sikuli {

	public static void main(String[] args) throws InterruptedException, AWTException, FindFailed {
// TC1: Launch Chrome Browser 		
		WebDriver driver = new ChromeDriver();

// TC2: Goto Test URL	https://smallpdf.com/word-to-pdf#r=convert-to-word
		driver.get("https://smallpdf.com/word-to-pdf");

		// Wait Time 5 Sec 1se=1000ms
		Thread.sleep(5000);

//	TC4: manage the browser window to maximize -  Maximize Browser Window 		
		driver.manage().window().maximize();
		// Wait Time 3 Sec 1se=1000ms
		Thread.sleep(3000);

		//Implementing Sikuli
		Screen s=new Screen();
		//TC5: Click on Choose File Button
		s.click("D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Automation\\myAutomationProject\\sikuli_Locators\\click_ChoosefileButton.png");
		Thread.sleep(5000);
		Pattern fileinput=new Pattern("D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Automation\\myAutomationProject\\sikuli_Locators\\type_PathOfFile.png");
		Thread.sleep(4000);
		//send the path of the file into the textbox
		s.type(fileinput,"D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Automation\\myAutomationProject\\sikuli_Locators\\Test.docx");
		
		Thread.sleep(4000);
		//Click on open button
		s.click("D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Automation\\myAutomationProject\\sikuli_Locators\\click_Open.png");
		Thread.sleep(4000);
		//WebDriver Wait to complete file conversion

		  WebElement clickDownload = new WebDriverWait(driver,Duration.ofSeconds(30)).
				  until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Download']")));
		//click on download buttton
		  s.click("D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Automation\\myAutomationProject\\sikuli_Locators\\click_Download.png");
		  Thread.sleep(4000);
		 //Close Browser
		  driver.close();
		 

	}

}
