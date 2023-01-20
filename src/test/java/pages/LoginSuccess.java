package pages;

import org.openqa.selenium.By;

import base.Base;

public class LoginSuccess extends Base {

	By click_on_basic_auth = By.xpath("//div[2]/div/ul/li[3]/a");
	
	By verify_congratulations = By.xpath("//div[2]/div/div/p");
	
	public void click_basicAuth() {
		click(click_on_basic_auth);
	}
	
	public String get_Verify_Congratulation() {
		return getText(verify_congratulations);
	}
}
