package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeSettingsPage {
	WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(xpath = "//li[@id='popup_menu_item_1']/a")
	private WebElement turnFeaturesONorOFF;
	
	@FindBy(xpath = "//li[@id='popup_menu_item_6']/a")
	private WebElement generalSettings;
	
	@FindBy(xpath = "//li[@id='popup_menu_item_2']/a")
	private WebElement typeofWork;
	
	@FindBy(xpath = "//li[@id='popup_menu_item_9']/a")
	private WebElement workFlow;
	@FindBy(xpath = "//li[@id='popup_menu_item_3']/a")
	private WebElement LeaveTypes;
	@FindBy(xpath = "//li[@id='popup_menu_item_5']/a")
	private WebElement Notifications;
	@FindBy(xpath = "//li[@id='popup_menu_item_7']/a")
	private WebElement LogoSettings;
	@FindBy(xpath = "//li[@id='popup_menu_item_8']/a")
	private WebElement Licenses;
	@FindBy(xpath = "//input[@id='DiscardChangesButton']")
	private WebElement cancelAndLeave;
	
	
	public ActitimeSettingsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnturnFeaturesONorOFFMethod() {
		turnFeaturesONorOFF.click();
	}
	public void clickonTypeOfWorkMethod() {
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(typeofWork));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", typeofWork);
		//typeofWork.click();
	}
	public void clickOngeneralSettingsFMethod() {
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(generalSettings));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", generalSettings);
		//generalSettings.click();
	}
	public void clickOnworkFlowFMethod() {
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(workFlow));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", workFlow);
		//workFlow.click();
	}
	public void clickOnLeaveTypesMethod() {
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(LeaveTypes));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", LeaveTypes);
		
	}
	public void clickOnNotificationsMethod() {
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Notifications));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Notifications);
		//Notifications.click();
	}
	public void clickOnLogoSettingsMethod() {
		LogoSettings.click();
	}
	public void clickOnLicensesMethod() {
		Licenses.click();
	}

}
