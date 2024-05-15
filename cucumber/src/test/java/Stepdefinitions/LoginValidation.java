package Stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.LoginPF;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginValidation {
	WebDriver driver = null;
	LoginPF login;
	
	@Given("Open the browser")
	public void open_the_browser() {
		System.setProperty("webdriver.edge.driver", "C:/Users/user/eclipse-workspace/BBD/src/test/resources/Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Then("user is navigated to login page")
	public void user_is_navigated_to_login_page() {
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Facebook page is navigated");
	}
	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username, String password) {
		login.enterUsername(username);
		login.enterPassword(password);
		System.out.println("valid User name and password enter");
	}
	@Then("click on the button")
	public void click_on_the_button() {
		login.btnLogin(); 
		System.out.println("User clicked the login button");
	}
	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {
		Assert.assertTrue("User not navigated to home page", login.isHomePageDisplayed());
	}
	@When("user enters {string} and {string}")
	public void user_enters_invalid_username_and_password(String username, String password) {
		login.enterUsername(username);
		login.enterPassword(password);
	}
	@Then("user is login failed")
	public void user_is_login_failed() {
		 Assert.assertTrue("Login failed message not displayed", login.isLoginFailedMessageDisplayed());
	}
}


