package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUserPage {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	@FindBy(xpath = "//div[@class='components_button withPlusIcon']")
	private WebElement newUserBtn;
	
	
	public ActitimeUserPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNewUserButton() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(newUserBtn));
		js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].click()", newUserBtn);
		
	}
	

}
