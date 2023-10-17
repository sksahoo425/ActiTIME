package testNGtest;

import java.util.Random;

import org.testng.annotations.Test;

import generics.BaseTest;
import pages.ActitimeCreateNewCustomerPage;
import pages.ActitimeHomePage;
import pages.ActitimeTasksPage;

public class TC_02_CreateNewCx extends BaseTest {

	@Test
	public void CreateNewCx() throws Throwable {
		
		
		int x= new Random().nextInt(1, 2000);
		
		
		ActitimeHomePage home= new ActitimeHomePage(driver);
		home.taskslinkmethod();
		
		ActitimeTasksPage task = new ActitimeTasksPage(driver);
		task.addnewMethod();
		task.addcustomerMethod();
		
		ActitimeCreateNewCustomerPage cx = new ActitimeCreateNewCustomerPage(driver);
		cx.entercustomerMethod("newCx"+x);
		cx.createcustomerMethod();
		
		
		
		
	}


}
