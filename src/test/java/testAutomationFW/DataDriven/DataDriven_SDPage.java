package testAutomationFW.DataDriven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven_SDPage {
	public  WebDriver driver;
  @Test(dataProvider="sd_testdata")
  public void sdLogin(String uname,String pwd) throws InterruptedException {
	//TC:1 Launch Chrome Browser 
			driver=new ChromeDriver();
	//TC:2 Goto Test URL https://www.saucedemo.com/
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(5000);
	//TC:3 Fill Username textbox with input 
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
			Thread.sleep(5000);
	//TC:4 Fill Password textbox with input 
					driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
					Thread.sleep(5000);
	//TC:5 Click on Login Button
					driver.findElement(By.xpath("//input[@name='login-button']")).click();
					Thread.sleep(5000);
	//TC:6 Verify Login
					String ExpectedURL="https://www.saucedemo.com/inventory.html";
					String ActualURL=driver.getCurrentUrl();
					Assert.assertEquals(ActualURL, ExpectedURL);
					
  }
  
  @AfterMethod
  public void getResult(ITestResult testResult)
  {
	  System.out.println("TestCase Name:"+testResult.getName());
	  System.out.println("TestCase Result:"+testResult.getStatus());  //If result is 1 ---Pased, if it's 2 --- Failed
	  int status=testResult.getStatus();
	  if(status==1)
	  {
	//TC:7 Close the Browser
		driver.close();
	  }
	  else
	 /* {
		//Take the Entire Screen Screenshoot 
		  File outfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileUtils.copyFile(outfile,new File("D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Automation\\myAutomationProject\\src\\test\\resources\\allResourceFiles\\"+testResult.getParameters()[0]+"Defect.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Close the Browser
			driver.close();
	  }*/
		  
	  {
			//Take the Screenshoot of Speific Element
		  	  WebElement errmsg=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface')]"));
			  File outfile=((TakesScreenshot)errmsg).getScreenshotAs(OutputType.FILE);
			  try {
				FileUtils.copyFile(outfile,new File("D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Automation\\myAutomationProject\\src\\test\\resources\\allResourceFiles\\"+testResult.getParameters()[0]+"Defect.jpeg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Close the Browser
				driver.close();
		  }
	  
	  
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
