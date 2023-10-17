package testNGtest;

import java.util.Random;

import org.testng.annotations.Test;

import generics.BaseTest;
import pages.ActitimeAddUserPage;
import pages.ActitimeHomePage;
import pages.ActitimeUserPage;

public class TC_07_CreateUser extends BaseTest{
	@Test
	public void TC_07() throws Exception {
		int x = new Random().nextInt(1, 200);
		
		
		ActitimeHomePage homepage = new ActitimeHomePage(driver);
		homepage.userlinkmethod();
		
		ActitimeUserPage userpage=new ActitimeUserPage(driver);
		userpage.clickOnNewUserButton();
		ActitimeAddUserPage adduser = new ActitimeAddUserPage(driver);
		adduser.fillUserData("sk", "ooooo", "ooooo@gamil.com");
	}

}
