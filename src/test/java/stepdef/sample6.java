package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class sample6 {
	WebDriver driver;
	@Given("displays hi message")
	public void displays_hi_message() {
	    System.out.println("hi");
	}

	@Given("user opens testmeapp in the browser")
	public void user_opens_testmeapp_in_the_browser() {
		System.setProperty("WebDriver.Chrome.Driver","C:\\seldriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");

	}

	@Then("user enters the username as {string} and password as {string}")
	public void user_enters_the_username_as_and_password_as(String un, String pwd) {
		driver.findElement(By.id("userName")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);

	}

	@Then("user clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.name("login")).click();
	}
	
}
