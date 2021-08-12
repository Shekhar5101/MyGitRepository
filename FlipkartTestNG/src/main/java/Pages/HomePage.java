package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath = "//div[text()='Top Offers']")
	private WebElement topOffers;
	
	@FindBy (xpath = "//div[text()='Mobiles']")
	private WebElement mobilesBtn;
	
	@FindBy (xpath = "//div[text()='Fashion']")
	private WebElement fashionBtn;
	
	@FindBy (xpath = "//div[text()='Electronics']")
	private WebElement electronicsBtn;
	
	@FindBy (xpath = "//div[text()='Travel']")
	private WebElement travelBtn;
	
	@FindBy (xpath = "//a[text()='Cart']")
	private WebElement cartBtn;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickTravelLink() {
		travelBtn.click();
	}
	public void clickTopOffers() {
		topOffers.click();
	}
	public void clickMobiles() {
		mobilesBtn.click();
	}
	public void clickFashion() {
		fashionBtn.click();
	}
	public void clickElectronics() {
		electronicsBtn.click();
	}
	public void goToMyCart() {
		cartBtn.click();
	}
	public void clickfashion() {
		fashionBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
