package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;

public class ActitimeHomePage extends BasePage implements AutoConstant {
	public WebDriver driver;
	JavascriptExecutor js;

	// declaration
	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement taskbutton;

	@FindBy(xpath = "(//div[@class='popup_menu_icon'])[2]")
	private WebElement settingbutton;

	@FindBy(id = "logoutLink")
	private WebElement logoutLink;

	@FindBy(xpath = "//div[@class='productName']//div[text()='Switch to actiPLANS']")
	private WebElement switchtoactiPLANSLink;

	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement taskLink;

	@FindBy(xpath = "//div[text()='Reports']")
	private WebElement reportsLink;

	@FindBy(xpath = "//div[@id='container_tt']")
	private WebElement trackTimeLink;

	@FindBy(xpath = "//div[@id='container_users']")
	private WebElement userlink;

	@FindBy(xpath = "//div[@class='popup_menu_button popup_menu_button_calendar']//div[@class='menu_icon']")
	private WebElement calenderLink;

	@FindBy(xpath = "//div[contains(@class,'popup_menu_button popup_menu_button_settings')]//div[@class='menu_icon']")
	private WebElement settingsLink;

	@FindBy(xpath = "//div[contains(@class,'popup_menu_button popup_menu_button_addons')]//div[@class='menu_icon']")
	private WebElement addonsLink;

	@FindBy(xpath = "//div[contains(@class,'popup_menu_button popup_menu_button_support')]//div[@class='menu_icon']")
	private WebElement supportLink;

	@FindBy(xpath = "//div[contains(@class,'popup_menu_button popup_menu_button_tips')]//div[@class='popup_menu_icon']")
	private WebElement tipsLink;

	// intialization

	public ActitimeHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// utilization

	public void logoutMethod() throws InterruptedException {
		visibilityOfElement(driver, logoutLink);
		javascriptHighlight(driver, logoutLink);
		javascriptClick(driver, logoutLink);

	}

	public void settingmethod() throws InterruptedException {
		visibilityOfElement(driver, settingbutton);
		javascriptHighlight(driver, settingbutton);
		javascriptClick(driver, settingbutton);
	}

	public void trackTimeLink() throws InterruptedException {

		visibilityOfElement(driver, trackTimeLink);
		javascriptHighlight(driver, trackTimeLink);
		javascriptClick(driver, trackTimeLink);
	}

	public void taskslinkmethod() throws InterruptedException {
		visibilityOfElement(driver, taskbutton);
		javascriptHighlight(driver, taskbutton);
		javascriptClick(driver, taskbutton);
	}

	public void reportlinkmethod() throws InterruptedException {

		visibilityOfElement(driver, reportsLink);
		javascriptHighlight(driver, reportsLink);
		javascriptClick(driver, reportsLink);
	}

	public void userlinkmethod() throws InterruptedException {

		visibilityOfElement(driver, userlink);
		javascriptHighlight(driver, userlink);
		javascriptClick(driver, userlink);
	}

	public void calenderlinkmethod() throws InterruptedException {

		visibilityOfElement(driver, calenderLink);
		javascriptHighlight(driver, calenderLink);
		javascriptClick(driver, calenderLink);
	}

}
