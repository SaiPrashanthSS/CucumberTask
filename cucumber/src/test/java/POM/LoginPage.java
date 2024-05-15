package POM;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
 
	WebDriver driver;
	
	By txt_username = By.id("email");
	By txt_password = By.id("passContainer");
	By btn_login = By.id("u_0_c_Ms");

	public LoginPage(WebDriver driver) {
		 this.driver=driver;
	}
	
public void enterUsername(String username) {
driver.findElement(txt_username).sendKeys(username);
}

public void enterPassowrd(String password) {
driver.findElement(txt_password).sendKeys(password);
}

public void btnLog() {
	driver.findElement(btn_login).click();
	
}}
