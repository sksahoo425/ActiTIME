package testNGtest;

import java.util.Random;

import org.testng.annotations.Test;

import generics.BaseTest;
import pages.ActitimeCreateNewLeaveTypePage;
import pages.ActitimeHomePage;
import pages.ActitimeSettingsPage;
import pages.LeaveTypesPage;

public class TC_05_CreateLeaveTypeAndLogout extends BaseTest{
	@Test
	public void TC_05() throws Exception {
		int x = new Random().nextInt(1, 200);
		

		ActitimeHomePage homepageopen = new ActitimeHomePage(driver);
		homepageopen.settingmethod();

		ActitimeSettingsPage settingpage = new ActitimeSettingsPage(driver);
		settingpage.clickOnLeaveTypesMethod();

		LeaveTypesPage leavetype = new LeaveTypesPage(driver);
		leavetype.clickoncreateLeaveTypeButton();

		ActitimeCreateNewLeaveTypePage newleavetype = new ActitimeCreateNewLeaveTypePage(driver);
		newleavetype.leaveTypeNameTextField("holiday" + x);
		newleavetype.clickOncreateLeaveTypeButton();

		
	}

}
