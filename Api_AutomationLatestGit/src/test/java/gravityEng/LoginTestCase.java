package gravityEng;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTestCase {

	//------------ Xpath Repository -------------

	// Using @FindBy to locate a single element by ID, Xpath etc

	@FindBy(xpath = "//input[@name=\"username\"]")
	private WebElement txtBox_userName_HomePage;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement txtBox_passWord_HomePage;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement btn_login_HomePage;

	@FindBy(xpath = "//h6[text()=\"Dashboard\"]//following::i[1]")
	private WebElement dd_logOut_Dashboard;

	@FindBy(xpath = "(//a[@role=\"menuitem\"])[4]")
	private WebElement btn_logOut_Dashboard;
		
	@FindBy(xpath = "//h6[text()=\"Dashboard\"]//following::p[1]")
	private WebElement txt_userDetails_Dashboard;

	//---------------------Methods-----------------

	public static WebDriver driver;

	static String demoUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String desiredBrowser = "chrome";       // firefox //chrome
	static String browserVersionChrome = "126.0.6478.185";
	static String browserVersionFireFox = "129.0b7";

	@BeforeMethod
	public void startBrowser () {		

		if (desiredBrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();		

		}

		else if (desiredBrowser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().browserVersion(browserVersionFireFox).setup();
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(demoUrl);
		
		// Initialize the elements with PageFactory
        PageFactory.initElements(driver, this);
	}


	@Test
	public void login() throws InterruptedException {

		txtBox_userName_HomePage.sendKeys("Admin");

		Thread.sleep(1000);         //Time given for understanding the flow only

		txtBox_passWord_HomePage.sendKeys("admin123");

		Thread.sleep(1000);			//Time given for understanding the flow only

		btn_login_HomePage.click();

		Thread.sleep(1000);
		
		Assert.assertTrue(txt_userDetails_Dashboard.isDisplayed(), "Profile should be displayed after login");
    
		dd_logOut_Dashboard.click();

		Thread.sleep(1000);

		btn_logOut_Dashboard.click();
	
	}

	@AfterMethod	
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}

