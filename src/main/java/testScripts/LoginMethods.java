package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.WebElementsOfGitHUb;
import utils.PropertyReaderFile;

public class LoginMethods {
	public WebDriver driver;
	
		@BeforeMethod
		public void openApplication() {
			System.setProperty(PropertyReaderFile.getValue("Key"), PropertyReaderFile.getValue("path"));
			driver=new FirefoxDriver();
			driver.get(PropertyReaderFile.getValue("url"));
			
		}
		@Test
		public void loginofGitHub() {
			WebElementsOfGitHUb obj= new WebElementsOfGitHUb();
			obj.Intialization(driver);
			obj.usernameofGithub(PropertyReaderFile.getValue("email"));
			obj.passwordofGithub(PropertyReaderFile.getValue("password"));
			obj.loginButton();
			
			
			
		}
	

}

