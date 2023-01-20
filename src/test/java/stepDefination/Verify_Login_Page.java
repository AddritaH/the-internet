package stepDefination;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginSuccess;
import static org.junit.Assert.assertEquals;

	
	
public class Verify_Login_Page extends Base{
	
	LoginSuccess login_success = new LoginSuccess();
	
	
	@Given("I am in landing home page The-Internet")
	public void i_am_in_landing_home_page_The_Internet() {
		navigateURL("http://admin:admin@157.90.19.124:7080/");
}

	@And("I click on Basic Auth")
	public void i_click_on_Basic_Auth() {
	    login_success.click_basicAuth();
	}


	@Then("I verify {string}")
	public void i_verify(String expected) {
		String actaul = login_success.get_Verify_Congratulation();
		assertEquals(expected, actaul);
	   
	}


}
