package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelBooking {
	@FindBy (xpath = "//label[@for='ONE_WAY']")
	private WebElement oneWay;
	
	@FindBy (xpath = "//label[@for='ROUND_TRIP']")
	private WebElement roundTrip;
	
	@FindBy (name = "0-departcity")
	private WebElement departureCity;
	
	@FindBy (name = "0-arrivalcity")
	private WebElement arrivalCity;
	
	@FindBy (name = "0-datefrom")
	private WebElement departDate;
	
	@FindBy (name = "0-dateto")
	private WebElement returnDate;
	
	@FindBy (name = "0-travellerclasscount")
	private WebElement travelClass;
	
	@FindBy (xpath = "(//div[@class='_1_YMe_']//div[@class='VjWsXZ'])[1]")
	private WebElement subAdult;
	
	@FindBy (xpath = "(//div[@class='_1_YMe_']//div[@class='VjWsXZ'])[2]")
	private WebElement addAdult;
	
	@FindBy (xpath = "(//div[@class='_1_YMe_']//div[@class='VjWsXZ'])[3]")
	private WebElement subChild;
	
	@FindBy (xpath = "(//div[@class='_1_YMe_']//div[@class='VjWsXZ'])[4]")
	private WebElement addChild;
	
	@FindBy (xpath = "(//div[@class='_1_YMe_']//div[@class='VjWsXZ'])[5]")
	private WebElement subInfant;
	
	@FindBy (xpath = "(//div[@class='_1_YMe_']//div[@class='VjWsXZ'])[6]")
	private WebElement addInfant;
	
	@FindBy (xpath = "//button[text()='Done']")
	private WebElement doneBtn;
	
	public TravelBooking(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectOneWay() {
		oneWay.click();
		}
	public void selectRoundTrip() {
		roundTrip.click();
	}
	
	public void selectDepCity() {
		departureCity.click();
		departureCity.click();
		departureCity.sendKeys(null);
	}
	

	
	

}
