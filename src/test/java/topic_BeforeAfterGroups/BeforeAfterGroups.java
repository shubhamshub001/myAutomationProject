package topic_BeforeAfterGroups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAfterGroups {
 //For Security
	@BeforeGroups("security")
	public void setupSecurity()
	{
	System.out.println("setupSecurity");	
	}
	
	@AfterGroups("security")
	public void tearDownSecurity()
	{
	System.out.println("tearDownSecurity");	
	}
//For DB
		@BeforeGroups("db")
		public void setupDB()
		{
			System.out.println("setupDB");
		}
		@AfterGroups("db")
		public void tearDownDB()
		{
			System.out.println("tearDownDB");
		}
//For UI
		@BeforeGroups("ui")
		public void setupUI()
		{
			System.out.println("setupUI");
		}
		@AfterGroups("ui")
		public void tearDownUI()
		{
			System.out.println("tearDownUI");
		}
		
		
		
//Real Test Cases for UI
		 @Test(groups="ui")
		  public void accessHomePage() {
			  System.out.println("accessHomePage");
		  }
		  @Test(groups="ui")
		  public void accessContactUSPage() {
			  System.out.println("accessContactUSPage");
		  }
		  @Test(groups="ui")
		  public void accessCampaignsPage() {
			  System.out.println("accessCampaignsPage");
		  }
//Real Test Cases for DB
		  @Test(groups="db")
		  public void testInsert() {
			  System.out.println("testInsert");
			  
		  }
		  @Test(groups="db")
		  public void testUpdate() {
			  System.out.println("testUpdate");
			  
		  }
		  @Test(groups="db")
		  public void testDelete() {
			  System.out.println("testDelete");
			  
		  }
//Real Test Cases for Security
		  @Test(groups="security")
		  public void openFileDialog() {
			  System.out.println("openFileDialog");
			  
		  }
		  @Test(groups="security")
		  public void openConfirmationDialog() {
			  System.out.println("openConfirmationDialog");
			  
		  }
		  @Test(groups="security")
		  public void closeFileDialog() {
			  System.out.println("closeFileDialog");
			  
		  }
		  
		  
		  
		
}
