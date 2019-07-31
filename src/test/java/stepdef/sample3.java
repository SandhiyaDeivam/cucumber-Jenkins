package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class sample3 {

	@When("user open chrome browser and opens application")
	public void user_open_chrome_browser_and_opens_application() {
	    System.out.println("Login page");
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String un, String pswd) {
	    System.out.println("username "+un+ "\npassword"+pswd);
	}

	@When("user clicks login")
	public void user_clicks_login() {
	   System.out.println("clicks login");
	}
	
	@Given("displays welcome message")
		public void display() {
		System.out.println("WELCOME");
	}

}
