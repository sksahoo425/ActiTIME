package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.AutoConstant;
import generics.BasePage;

public class ActitimeAddUserPage extends BasePage implements AutoConstant{
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	@FindBy(xpath = "//div[@class='create_user_sliding_panel sliding_panel components_panelContainer']//input[@name='firstName']")
	private WebElement firstNameTextfield;
	@FindBy(xpath = "//div[@class='create_user_sliding_panel sliding_panel components_panelContainer']//input[@name='lastName']")
	private WebElement lastNameTextField;
	@FindBy(xpath = "//div[@class='create_user_sliding_panel sliding_panel components_panelContainer']//input[@name='email']")
	private WebElement emailtextfield;
	@FindBy(xpath = "//div[.='Save & Send Invitation']")
	private WebElement saveandSendInvitationBTN;
	@FindBy(xpath = "//div[@class='closeLink']/span")
	private WebElement closebtn;

	public ActitimeAddUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillUserData(String userFirstName, String userLastName, String UserMailId) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(firstNameTextfield));
		firstNameTextfield.sendKeys(userFirstName);
		wait.until(ExpectedConditions.visibilityOf(lastNameTextField));
		lastNameTextField.sendKeys(userLastName);
		wait.until(ExpectedConditions.visibilityOf(emailtextfield));
		emailtextfield.sendKeys(UserMailId);
		wait.until(ExpectedConditions.visibilityOf(saveandSendInvitationBTN));
		saveandSendInvitationBTN.click();
		wait.until(ExpectedConditions.visibilityOf(closebtn));
		closebtn.click();

	}
}
