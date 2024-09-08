package topic_AdvAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestUI2 {
 
  
  
 

  @Test(groups="ui")
  public void accessHomePage1() {
	  System.out.println("accessHomePage1");
  }
  @Test(groups="ui")
  public void accessContactUSPage1() {
	  System.out.println("accessContactUSPage1");
  }
  @Test(groups="ui")
  public void accessCampaignsPage1() {
	  System.out.println("accessCampaignsPage1");
  }
}
