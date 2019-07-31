package stepdef;

import cucumber.api.java.en.Given;

public class sample4 {

	@Given("displaying hello message")
	public void displaying_hello_message() {
	   System.out.println("hello");
	}

	@Given("user login to the flight application")
	public void user_login_to_the_flight_application() {
		System.out.println("login page");
	}

	@Given("user searches for the particular flight")
	public void user_searches_for_the_particular_flight() {
		System.out.println("search page");
	}

	@Given("user pays for the particular flight")
	public void user_pays_for_the_particular_flight() {
		System.out.println("payment page");
	}

	@Given("user confirms and booked the flight")
	public void user_confirms_and_booked_the_flight() {
		System.out.println("confirm page");
	}

	
}
