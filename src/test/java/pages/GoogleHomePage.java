package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
	@FindBy(xpath = "//textarea[@name='q']")
	private WebElement searchbox;
	@FindBy(xpath = "")
	private WebElement searcbutton;
	@FindBy(xpath = "//textarea[@name='q']/../../../..//b")
	private List<WebElement> contentofSearchbox;

	public GoogleHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchTextBox(String textValue) {
		searchbox.sendKeys(textValue);
	}
	public void selectFromAutoSuggation(String auto_Sugg_Argument) {
		for(int i =0;i<contentofSearchbox.size();i++)
		{
			if (contentofSearchbox.get(i).getText().equalsIgnoreCase(auto_Sugg_Argument)) {
				contentofSearchbox.get(i).click();
				break;
			}
			
		}
	} 

}
