package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTypesOfWorkPage {
	@FindBy(xpath = "//input[@name='name']")
	private WebElement nameTextField;

	@FindBy(xpath = "//td[contains(text(),'Status:')]/..//option")
	private List<WebElement> statusDropdown;

	@FindBy(xpath = "//label[contains(text(),'Billable')]")
	private List<WebElement> catagoryRadioButton;

	@FindBy(xpath = "//input[@id='billingRate_input']")
	private WebElement billingRate;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createTypeOfWorkButton;

	public CreateTypesOfWorkPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void nameTextField(String name) {
		nameTextField.sendKeys(name);
	}

	public void SelectStatusDropdown(String statusDropdownvalue) {

		for (int i = 0; i < statusDropdown.size(); i++) {
			System.out.println("size of statusradiobutton is: " + statusDropdown.size());
			if (statusDropdown.get(i).getText().contains(statusDropdownvalue)) {
				statusDropdown.get(i).click();
				break;
			} else {
				System.out.println("plz provide correct statusDropdownvalue ");
			}
		}
	}

	public void selectCatagoryRadioButton(String CatagoryDropdownvalue) {

		for (int i = 0; i < catagoryRadioButton.size(); i++) {
			System.out.println("size of catagoryRadioButton is: " + catagoryRadioButton.size());
			if (catagoryRadioButton.get(i).getText().contains(CatagoryDropdownvalue)) {
				catagoryRadioButton.get(i).click();
				break;
			} else {
				System.out.println("plz provide correct catagoryRadioButton ");
			}
		}
	}

	public void billingRate(String billingRateValue) {
		billingRate.sendKeys(billingRateValue);
	}

	public void clickOnCreateTypeOfWorkButton() {
		createTypeOfWorkButton.click();
	}

	public void createTypeOfWorkAtaTime(String name, String statusDropdownvalue, String CatagoryDropdownvalue, String billingRateValue ) {
		nameTextField.sendKeys(name);

		for (int i = 0; i < statusDropdown.size(); i++) {
			System.out.println("size of statusradiobutton is: " + statusDropdown.size());
			if (statusDropdown.get(i).getText().contains(statusDropdownvalue)) {
				statusDropdown.get(i).click();
				break;
			} else {
				System.out.println("plz provide correct statusDropdownvalue ");
			}
		}


		for (int i = 0; i < catagoryRadioButton.size(); i++) {
			System.out.println("size of catagoryRadioButton is: " + catagoryRadioButton.size());
			if (catagoryRadioButton.get(i).getText().contains(CatagoryDropdownvalue)) {
				catagoryRadioButton.get(i).click();
				break;
			} else {
				System.out.println("plz provide correct catagoryRadioButton ");
			}
		}
	
		billingRate.sendKeys(billingRateValue);
		createTypeOfWorkButton.click();

	}

}
