package generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.ActitimeLoginPage;

public class BaseTest implements AutoConstant {
	public WebDriver driver;
	public Properties properties;
	//public static Logger logger;

	@BeforeSuite
	public void executionStart() {
		Reporter.log("----------Execution Started----------", true);
	}

	@BeforeClass
	public void setup() throws IOException, InterruptedException {
		Reporter.log("Setup Started", true);
		FileInputStream fis = new FileInputStream("./properties/config.properties");
		properties = new Properties();
		properties.load(fis);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.get(properties.getProperty("url"));
		
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.loginMethod();
		
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	@AfterSuite
	public void executionComplete() {
		Reporter.log("----------Execution Completed----------", true);
	}

	public void getScreenShot(String name) {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File srcFile = ss.getScreenshotAs(OutputType.FILE);
		File destFile = new File(
				"screenShot/" + name + Calendar.getInstance().getTime().toString().replaceAll(":", "_") + ".png");
		try {
			FileHandler.copy(srcFile, destFile);
			Reporter.log("<a href = '" + destFile.getAbsolutePath() + "' <img src = '" + destFile.getAbsolutePath()
			+ "' hight = '100' width = '100'/></a>",true);

		} catch (IOException e) {
			System.out.println("error occured at repo");
		}

	}

}
