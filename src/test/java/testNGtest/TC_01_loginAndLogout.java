package testNGtest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generics.BaseTest;

public class TC_01_loginAndLogout extends BaseTest {

	@Test
	public void loginAndLogout() throws Throwable {

		Reporter.log("logedin to application", false);

	}

}
