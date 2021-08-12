package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy (xpath = "//a[text()='Login']")
	private WebElement loginBtn;
	
	@FindBy (xpath = "//inpur[@type='text']")
	private WebElement username;
	
	@FindBy (xpath = "//inpur[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//inpur[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy (xpath = "//span[text()='Forgot?']")
	private WebElement forgotBtn;
	
	@FindBy (xpath = "//a[contains(text(),'Create an account')]")
	private WebElement createAccount;
	
	
	public LandingPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public void clickLogin() {
		loginBtn.click();
	}
	public void sendUsername(String user) {
		username.sendKeys(user);
	}
	public void sendPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickSubmit() {
		submitBtn.click();
	}
	public void clickForgot() {
		forgotBtn.click();
	}
	public void createAccount() {
		createAccount.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

