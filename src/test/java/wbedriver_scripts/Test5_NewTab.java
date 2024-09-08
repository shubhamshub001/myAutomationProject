package wbedriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5_NewTab {

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

//TS4: Create new Tab
gcdriver.switchTo().newWindow(WindowType.TAB);
//Wait Time 
Thread.sleep(3000);

//TS7: Close the Active Browser Window
gcdriver.close();

	}

}
