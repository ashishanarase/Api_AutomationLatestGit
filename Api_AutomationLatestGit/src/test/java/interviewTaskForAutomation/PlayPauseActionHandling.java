package interviewTaskForAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayPauseActionHandling {
	
	public static void main(String[] args) throws InterruptedException   {

		//Create Webdriver Instance
		WebDriverManager.chromedriver().browserVersion("123.0.6312.60").setup(); 
		//pass your browser version here to avoid Compatibility Issues
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.youtube.com/watch?v=B_6d3RBiEN0&list=RDB_6d3RBiEN0&start_radio=1&rv=kDXfCLevkKA");
		
		WebElement playButton = driver.findElement(By.xpath("//button[@data-title-no-tooltip=\"Play\"]"));
		playButton.click();
		System.out.println("Performed play using xpath and click operation");
		
		Thread.sleep(10000);
		
		WebElement pauseButton = driver.findElement(By.xpath("//button[@data-title-no-tooltip=\"Pause\"]"));
		pauseButton.click();
		System.out.println("Performed pause using xpath and click operation");
		
		Actions action = new Actions (driver);
		
		Thread.sleep(10000);
		
		action.moveToElement(playButton).build().perform();
		Thread.sleep(2000);
		action.click(playButton).build().perform();
		System.out.println("Performed play using actions class's click operation");
		
		Thread.sleep(10000);
		
		action.moveToElement(pauseButton).build().perform();
		action.click(pauseButton).build().perform();		
		System.out.println("Performed pause using actions class's click operation");
		
		Thread.sleep(10000);
		
		playButton.sendKeys(Keys.SPACE);
		System.out.println("Performed play using space bar on keyboard");
		
		Thread.sleep(10000);
		
		pauseButton.sendKeys(Keys.SPACE);
		System.out.println("Performed play using space bar on keyboard");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].currentTime = 0; arguments[0].play();", playButton);
		System.out.println("Performed play using JavaScriptExcutor");
		
		Thread.sleep(10000);
		
		js.executeScript("arguments[0].currentTime = 0; arguments[0].pause();", pauseButton);
		System.out.println("Performed pause using JavaScriptExcutor");
		
		Thread.sleep(10000);
		
		driver.quit();
	}

}
