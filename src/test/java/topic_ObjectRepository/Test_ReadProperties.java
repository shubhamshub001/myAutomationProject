package topic_ObjectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_ReadProperties {
	WebDriver driver;
  @Test
  public void sdLogin() throws IOException, InterruptedException {
	  Properties prop=new Properties();
	  FileInputStream ip=new FileInputStream("D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Automation\\myAutomationProject\\src\\test\\java\\topic_ObjectRepository\\config.properties");
	  prop.load(ip);
	  
	  //Name
	  String Name=prop.getProperty("name");
	  System.out.println(Name);
	  //Age
	  String Age=prop.getProperty("age");
	  System.out.println(Age);
	  //url
	  String URL=prop.getProperty("url");
	  System.out.println(URL);
	  //Browser
	  String Browser=prop.getProperty("browser");
	  System.out.println(Browser);
	  
	  if(Browser.equals("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(Browser.equals("edge"))
	  {
	  driver=new EdgeDriver();
	  }

	  else if(Browser.equals("ff"))
	  {
	  driver=new FirefoxDriver();
	  }
	  
	  //Goto Test URL
	  driver.get(URL);
	  Thread.sleep(5000);
	  //Fill Username textbox with input 
	  driver.findElement(By.xpath(prop.getProperty("UsernameFiled"))).sendKeys(prop.getProperty("username"));

	  Thread.sleep(5000);
	  //Fill Password textbox with input 
	  driver.findElement(By.xpath(prop.getProperty("PasswordField"))).sendKeys(prop.getProperty("password"));
	  Thread.sleep(5000);
	  //click on login button
	  driver.findElement(By.name(prop.getProperty("LoginBttn"))).click();
	  Thread.sleep(5000);
	  //close the browser
	  driver.close();
  }
}
