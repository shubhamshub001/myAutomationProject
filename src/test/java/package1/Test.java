package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Chrome Browser 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Goto Test URL
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		//Close Browser 
		driver.close();

	}

}
