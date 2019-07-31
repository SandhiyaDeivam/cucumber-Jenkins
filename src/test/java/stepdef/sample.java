package stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample {
	WebDriver driver;
	@When("user opens chrome browser and opens application")
	public void user_opens_chrome_browser_and_opens_application() {
	    System.setProperty("webdriver.chrome.driver", "C:\\seldriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://newtours.demoaut.com");
	}

	/*@When("user entering username as {string} And password as {string}")
	public void user_entering_username_as_And_password_as(String string, String string2) {
	   driver.findElement(By.name("userName")).sendKeys("mercury");
	   driver.findElement(By.name("password")).sendKeys("mercury");
	}*/

	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
	  driver.findElement(By.name("login")).click();
	}

	@Then("verify login result")
	public void verify_login_result() {
	   Assert.assertTrue(driver.getTitle().contains("Flight"));
	   driver.close();
	}
	
	@When("user entering username as {string} And  password as {string}")
	public void user_entering_username_as_And_password_as(String credentials, String credentials1 ) {
		driver.findElement(By.name("userName")).sendKeys(credentials1);
		   driver.findElement(By.name("password")).sendKeys(credentials1);
	}
}
