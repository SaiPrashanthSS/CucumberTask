package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPF {

	@FindBy(id="email")
	WebElement txt_username;

	@FindBy(id="passContainer")
	WebElement txt_password;

	@FindBy(id="u_0_c_Ms")
	WebElement btn_login;

	@FindBy(id="facebook")
	WebElement homePage;

	@FindBy(xpath = "//*[contains(text(), "The password that you've entered is incorrect. ")]")
	WebElement loginFailedMessage;

	WebDriver driver;

	public LoginPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	public void enterUsername(String username) {
		txt_username.sendKeys(username);

	}
	public void enterPassword(String password) {
		txt_username.sendKeys(password);
	}
	public void btnLogin() {
		btn_login.click();
	}
	public boolean isHomePageDisplayed() {
        return homePage.isDisplayed();
    }

    public boolean isLoginFailedMessageDisplayed() {
        return loginFailedMessage.isDisplayed();
}}
