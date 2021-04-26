package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebElementsOfGitHUb {
	@FindBy(xpath="//input[@id='login_field']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath ="//input[@name='commit']")
	private WebElement Signin;
	
	public void Intialization (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void usernameofGithub(String email) {
		username.sendKeys(email);
	}
	public void passwordofGithub(String pwd) {
		password.sendKeys(pwd);
	}
	public void loginButton() {
		Signin.click();
	}
	

}
