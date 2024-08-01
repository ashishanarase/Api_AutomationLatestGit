package gravityEng;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SearchFunctionality {

	// AndroidDriver<MobileElement> driver;
	//---------------------Methods-----------------

	@BeforeMethod
	public void setUp () {		

		DesiredCapabilities caps = new DesiredCapabilities();
	//	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	//	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	//	caps.setCapability(MobileCapabilityType.APP, "pathOfTheAPKFile/to/app.apk");

	//	driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
	}


	@Test
	public void login() throws InterruptedException {
	//	MobileElement searchField = driver.findElementById("com.appiumExample.nativeApp:accebilityId/searchField");
	//	MobileElement searchButton = driver.findElementById("com.example.app:id/searchButton");

	//	searchField.sendKeys("Product Name or Category");
	//	searchButton.click();

	//	MobileElement searchResult = driver.findElementById("com.appiumExample.nativeApp:accebilityId/searchResult");
	//	Assert.assertTrue(searchResult.isDisplayed(), "Search result should be displayed");
	}

	@AfterMethod	
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
//		driver.quit();
	}
}


