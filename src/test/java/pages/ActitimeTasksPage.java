package pages;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeTasksPage {
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement addcustomerLink;
	
	public ActitimeTasksPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addnewMethod()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(addnewButton));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addnewButton);
	}
	
	public void addcustomerMethod()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(addcustomerLink));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addcustomerLink);
	}

}
