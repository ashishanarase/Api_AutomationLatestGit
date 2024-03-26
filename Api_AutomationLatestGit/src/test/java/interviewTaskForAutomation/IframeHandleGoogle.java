package interviewTaskForAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandleGoogle {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().browserVersion(_dyanamicData.UpdateHere.browserVersion).setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.switchTo().frame(0);		
		Thread.sleep(2000);
		WebElement btn_staySignOut = driver.findElement(By.xpath("//button[@aria-label=\"Stay signed out\"]"));
		btn_staySignOut.click();
		
		Thread.sleep(2000);
		driver.close();
	}
}
