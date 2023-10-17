package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeaveTypesPage {
	WebDriver driver;
	WebDriverWait wait ;
	@FindBy(xpath = "//span[.='Create Leave Type']")
	private WebElement createLeaveTypeButton;
	@FindBy(xpath = "//td[contains(@class,'leaveTypeNameCell')]")
	private List<WebElement> AllleaveTypeName;
	@FindBy(xpath = "//td[contains(@class,'leaveTypeDeleteCell last')]")
	private List<WebElement> deleteLeaves;
	@FindBy(xpath = "//td[contains(@class,'leaveTypeDeleteCell last')]")
	private WebElement de;
	
	public LeaveTypesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickoncreateLeaveTypeButton() {

		createLeaveTypeButton.click();
	}
	public void deleteLeaveType(String LeaveTypeNameValue) {
		
		for(int i=0;i<AllleaveTypeName.size();i++) {
			wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.until(ExpectedConditions.visibilityOfAllElements(AllleaveTypeName));
			
			if(AllleaveTypeName.get(i).getText().contains(LeaveTypeNameValue)) {
				deleteLeaves.get(i).click();
				driver.switchTo().alert().accept();
				System.out.println("deleted");
				break;
			}
		}
	}
	

}
