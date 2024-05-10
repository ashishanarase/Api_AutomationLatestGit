package interviewTaskForAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColorValidation {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		//How you can validate the color automation script?
		
		WebDriverManager.chromedriver().browserVersion("124.0.6367.63").setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		String expectedColor = "#ff7b1d";
		
		System.out.println("Expected Color Code =" + expectedColor);
		
		WebElement btn_login_homePage = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		String rgbaColor = btn_login_homePage.getCssValue("background-color");
		
		Color formatColor = Color.fromString(rgbaColor);
		
		String actualColor = formatColor.asHex();
		
		System.out.println("Actual Color Code =" + actualColor);
		
		if (expectedColor.equals(actualColor)) {
			System.out.println("Color validation successfully done");
		}
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
} 