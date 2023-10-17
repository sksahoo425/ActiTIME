package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class  ActitimeLoginPage extends BasePage implements AutoConstant
{ WebDriver driver ;

	//Declration
	
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy (name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy (id="loginButton")
	private WebElement loginButton;

	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actiTimeIncLink;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;

	
	//intialization
	
	public ActitimeLoginPage ( WebDriver driver)
	
	{this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void loginMethod() throws IOException, InterruptedException
	{
		visibilityOfElement(driver, usernameTextfield);
		javascriptHighlight(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getcellValue(login_data_sheetname, 1, 0));
		
		visibilityOfElement(driver, passwordTextfield);
		javascriptHighlight(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getcellValue(login_data_sheetname, 1, 1));
		
		visibilityOfElement(driver, keepmeloggedinCheckbox);
		javascriptHighlight(driver, keepmeloggedinCheckbox);
		javascriptClick(driver, keepmeloggedinCheckbox);
		
		visibilityOfElement(driver, loginButton);
		javascriptHighlight(driver, loginButton);
		javascriptClick(driver, loginButton);
	}

	
	public void ForgotPasswordMethod()
	
	{
		forgotyourpasswordLink.click();
		
	}
	public void actitimeincMethod()
	{
		actiTimeIncLink.click();
	}
	

 }

