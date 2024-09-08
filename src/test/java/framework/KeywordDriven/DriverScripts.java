package framework.KeywordDriven;

import java.io.IOException;

import org.testng.annotations.Test;

public class DriverScripts {
	
	@Test
	public void setup() throws IOException, InterruptedException
	{
		String spath="D:\\Trainings_BhanuSai\\WeekendBatch_Oct14th_2023\\Automation\\myAutomationProject\\src\\test\\resources\\allResourceFiles\\Keywords.xlsx";
		ExcelUtils.setExcelFile(spath, "Sheet1");
		for(int iRow=1;iRow<=6;iRow++)
		{
			String sActionKeywords=ExcelUtils.getCellData(iRow,3);
			if(sActionKeywords.equals("openBrowser"))
			{
				ActionKeywords.openBrowser();
			}
			else if(sActionKeywords.equals("navigate"))
			{
				ActionKeywords.navigate();
			}
			else if(sActionKeywords.equals("inputUserName"))
			{
				ActionKeywords.inputUserName();
			}
			else if(sActionKeywords.equals("inputPassword"))
			{
				ActionKeywords.inputPassword();
			}
			else if(sActionKeywords.equals("clickSigin"))
			{
				ActionKeywords.clickSigin();
			}
			else if(sActionKeywords.equals("closeBrowser"))
			{
				ActionKeywords.closeBrowser();
			}
		}
		
		
	}

}
