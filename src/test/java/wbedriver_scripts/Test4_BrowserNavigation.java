package wbedriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
/*
 * Test Case - Automate Browser Navigation
 * TS1: Launch Chrome Browser 
 * TS2: Goto Test URL https://www.amazon.in
 * TS3: Navigate to URL https://www.flipkart.com
 * TS4: Navigate one step back to Amazon website
 * TS5: Navigate one step forward to Flipkart website
 * TS6: Reload Current Active Page
 * TS7: Close the Active Browser Window  */

//TS1: Launch Chrome Browser 
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver gcdriver=new ChromeDriver();

// TS2: Goto Test URL https://www.amazon.in
gcdriver.get("https://www.amazon.in");

//Wait Time 
Thread.sleep(3000);
//TS3: Navigate to URL https://www.flipkart.com
gcdriver.navigate().to("https://www.flipkart.com");
//Wait Time 
Thread.sleep(3000);
//TS4: Navigate one step back to Amazon website
gcdriver.navigate().back();
//Wait Time 
Thread.sleep(3000);

//TS5: Navigate one step forward to Flipkart website
gcdriver.navigate().forward();
//Wait Time 
Thread.sleep(3000);
//TS6: Reload Current Active Page
gcdriver.navigate().refresh();
//Wait Time 
Thread.sleep(3000);
//TS7: Close the Active Browser Window
gcdriver.close();

	}

}
