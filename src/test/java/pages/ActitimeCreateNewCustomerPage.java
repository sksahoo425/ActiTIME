package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeCreateNewCustomerPage {
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createcustomerButton;
	
	public ActitimeCreateNewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entercustomerMethod(String CxName)
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(entercustomernameTextfield));
		entercustomernameTextfield.sendKeys(CxName);
		System.out.println("cx created with name"+CxName);
	}
	
	public void createcustomerMethod()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(createcustomerButton));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", createcustomerButton);
	}


}
