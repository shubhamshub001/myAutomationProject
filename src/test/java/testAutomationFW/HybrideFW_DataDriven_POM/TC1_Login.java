package testAutomationFW.HybrideFW_DataDriven_POM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TC1_Login {
	static Page_Login login;
	static WebDriver driver;
	@Test(dataProvider="sd_testdata")
  public void verifySDLogin(String uname,String pwd) throws InterruptedException {

		//TC:1 Launch Chrome Browser 
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
	//TC:2 Goto Test URL https://www.saucedemo.com/
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(5000);
			login=new Page_Login(driver);
	//Fill Username textbox with input
			login.type_Username(uname);
	//Fill Password textbox with input 
			login.type_Password(pwd);
	//Click on Login Button
			login.click_Login();
			//TC:6 Verify Login
			String ExpectedURL="https://www.saucedemo.com/inventory.html";
			String ActualURL=driver.getCurrentUrl();
			Assert.assertEquals(ActualURL, ExpectedURL);
			Thread.sleep(5000);
			driver.close();
			
  }
  @DataProvider(name="sd_testdata")
  public Object[][] readExcel() throws BiffException, IOException
  {
	  //Open the Excel for read and write , which is available in the same package
	  File f=new File("D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Automation\\myAutomationProject\\src\\test\\resources\\allResourceFiles\\TestData_SwagDemo.xls");
	  Workbook w=Workbook.getWorkbook(f);
	  Sheet s=w.getSheet(0);
	  
	  int noofRows=s.getRows();
	  int noofColumns=s.getColumns();
	  
	  //Creating an Array to store the data of an excel sheet
	  String inputData[][]=new String[noofRows-1][noofColumns];
	  int count=0;
	  for(int i=1;i<noofRows;i++)
	  {
		  for(int j=0;j<noofColumns;j++)
		  {
			  Cell c=s.getCell(j,i);
			  inputData[count][j]=c.getContents();
		  }
		  count++;
	  }
	return inputData;
  }
 
}
