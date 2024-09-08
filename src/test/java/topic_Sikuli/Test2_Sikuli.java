
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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Test2_Sikuli {

	public static void main(String[] args) throws InterruptedException, AWTException, FindFailed, IOException {
// TC1: Launch Chrome Browser 		
		WebDriver driver = new ChromeDriver();

// TC2: Goto Test URL	https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");

		// Wait Time 5 Sec 1se=1000ms
		Thread.sleep(5000);

//	TC4: manage the browser window to maximize -  Maximize Browser Window 		
		driver.manage().window().maximize();
		// Wait Time 3 Sec 1se=1000ms
		Thread.sleep(3000);

		//Implementing Sikuli
		Screen s=new Screen();
		//TC: Fill Username Textbox with input
		s.type("D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Automation\\myAutomationProject\\sikuli_Locators\\type_UsernameTextbox.png","standard_user");
		
			  Thread.sleep(6000);
			  
	//Take Screenhot
			  ScreenImage si=s.capture();
			  BufferedImage bi=si.getImage();
			  File f1=new File("D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Automation\\myAutomationProject\\sikuli_Locators\\FullScreenshot.png");
			  ImageIO.write(bi, "PNG", f1);
			  Thread.sleep(4000);
			  //Close Browser
		driver.close();
		 

	}

}
