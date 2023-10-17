package testNGtest;

import java.util.Random;

import org.testng.annotations.Test;

import generics.BaseTest;
import pages.ActitimeHomePage;
import pages.ActitimeSettingsPage;
import pages.CreateTypesOfWorkPage;
import pages.TypeOfWorkPage;

public class TC_03_CreateWorkandLogout extends BaseTest{
	@Test
	public void TC_03() throws Exception {
		
		int random=new Random().nextInt(1, 999);
		ActitimeHomePage homepageopen = new ActitimeHomePage(driver);
		homepageopen.settingmethod();
		ActitimeSettingsPage settingpage = new ActitimeSettingsPage(driver);
		settingpage.clickonTypeOfWorkMethod();
		
		TypeOfWorkPage typeOfwork = new TypeOfWorkPage(driver);
		typeOfwork.clickOncreateTypesofWorkButton();
		
		CreateTypesOfWorkPage createtypeofwork = new CreateTypesOfWorkPage(driver);
		createtypeofwork.createTypeOfWorkAtaTime("spidyer"+random, "active", "Billable", "67");
		
		typeOfwork.deleteTypeOfWork("spidyer"+random);
	
		
		
		
	}

}
