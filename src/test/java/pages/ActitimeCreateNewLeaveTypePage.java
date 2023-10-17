package pages;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeCreateNewLeaveTypePage {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	@FindBy(xpath = "//input[@id='leaveTypeLightBox_nameField']")
	private WebElement leaveTypeName;
	@FindBy(xpath = "//div[@class='buttonIcon']")
	private WebElement createLeaveTypeButton;
	
	public ActitimeCreateNewLeaveTypePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void leaveTypeNameTextField(String leaveTypeNameValue) {
		leaveTypeName.sendKeys(leaveTypeNameValue);
	}
	public void clickOncreateLeaveTypeButton() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(createLeaveTypeButton));
		try {
			createLeaveTypeButton.click();
		} catch (ElementClickInterceptedException e) {
			js.executeScript("arguments[0].click()", createLeaveTypeButton);
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
		}
	}
	

}
