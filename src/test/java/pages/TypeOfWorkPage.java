package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypeOfWorkPage {
	WebDriver driver;
	String TypeofWorkName = "";
	
	@FindBy(xpath = "//span[contains(text(),'Create Type of Work')]")
	private WebElement createTypesofWorkButton;

	@FindBy(xpath = "//td[@class='formfieldtitle'][1]//tr")
	private List<WebElement> statusRadioButton;

	@FindBy(xpath = "//td[@class='formfieldtitle'][2]//tr")
	private List<WebElement> catagoryRadioButton;

	@FindBy(xpath = "//input[@value='Show Types of Work']")
	private WebElement showTypesOfWorkButton;

	@FindBy(xpath = "//tr[contains(@class,'typelisttblrow')]/td[7]")
	private List<WebElement> deleteButton;

	@FindBy(xpath = "//tr[contains(@class,'typelisttblrow')]/td[1]/a")
	private List<WebElement> allNameofTypeOfWork;

	@FindBy(xpath = "//span[@class='successmsg']")
	private WebElement messageOperation;

	public TypeOfWorkPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOncreateTypesofWorkButton() {
		createTypesofWorkButton.click();
	}

	public void selectStatusRadioButton(String radioButtonValue) {

		for (int i = 0; i < statusRadioButton.size(); i++) {
			System.out.println("size of statusradiobutton is: " + statusRadioButton.size());
			String s = statusRadioButton.get(i).getText();
			if (s.contains(radioButtonValue)) {
				statusRadioButton.get(i).click();
				break;
			} else {
				System.out.println(s + " =is not equal to= " + radioButtonValue);
			}
		}

	}

	public void SelectcatagoryRadioButton(String catagoryRadioButtonValue) {
		for (int i = 0; i < catagoryRadioButton.size(); i++) {
			System.out.println("size of statusradiobutton is: " + statusRadioButton.size());
			if (catagoryRadioButton.get(i).getText().contains(catagoryRadioButtonValue)) {
				catagoryRadioButton.get(i).click();
				break;
			} else {
				System.out.println("plz provide correct catagoryRadioButtonValue ");
			}
		}
	}

	public void ClickonshowTypesOfWorkButton() {
		showTypesOfWorkButton.click();
	}

	public void deleteTypeOfWork(String typeOfworkNameValue) {
		for (int i = 0; i < allNameofTypeOfWork.size(); i++) {
			if (allNameofTypeOfWork.get(i).getText().contains(typeOfworkNameValue)) {

				deleteButton.get(i).click();
				driver.switchTo().alert().accept();

			}
		}
	}
	public String messageAfterCreateOrDeleteOperation() {
		try {
			return messageOperation.getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "Operation not done"; 
		}
	}

}
