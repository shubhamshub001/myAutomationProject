package wbedriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6_NewWindow {

	public static void main(String[] args) throws InterruptedException {
/*
 * Test Case - Automate creating a new tab
 * TS2: Goto Test URL https://www.amazon.in
 * TS3: Manage the browser window to be maximized 
 * TS4: Create new Tab
 * TS7: Close the Active Browser Window  */

//TS1: Launch Chrome Browser 
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver gcdriver=new ChromeDriver();

// TS2: Goto Test URL https://www.amazon.in
gcdriver.get("https://www.amazon.in");

//Wait Time 
Thread.sleep(3000);

// TS3: Manage the browser window to be maximized 
gcdriver.manage().window().maximize();

//Wait Time 
Thread.sleep(3000);

//TS4: Create new Window
gcdriver.switchTo().newWindow(WindowType.WINDOW);
//Wait Time 
Thread.sleep(3000);
//Goto url https://www.google.com
gcdriver.navigate().to("https://www.google.com");

/*
 * //TS7: Close the Active Browser Window
 *  gcdriver.close();
 */
//Quit the Entire browser session
gcdriver.quit();
	}

}
