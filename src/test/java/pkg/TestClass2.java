package pkg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	public void M1() throws Exception {
		Reporter.log("test started", true);
		
	}
	@Test
	public void M2() throws Exception {
		Reporter.log("test ended", true);
		
	}

}
