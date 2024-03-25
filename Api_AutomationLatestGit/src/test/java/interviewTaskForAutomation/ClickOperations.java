package interviewTaskForAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOperations{

	static WebDriver driver;
	/*There are several ways to perform a click action on a web element.*/

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().browserVersion("122.0.6261.131").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		WebElement handle1 = driver.findElement(By.xpath("(//a[@target=\"_blank\"])[1]"));
		handle1.click();
		Thread.sleep(2000);
		
		WebElement handle2 =driver.findElement(By.xpath("(//a[@target=\"_blank\"])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", handle2);
		Thread.sleep(2000);
		
		WebElement handle3 =driver.findElement(By.xpath("(//a[@target=\"_blank\"])[3]"));
		Actions actions = new Actions(driver);
		actions.click(handle3).perform();
		Thread.sleep(2000);
		
		WebElement handle4 =driver.findElement(By.xpath("(//a[@target=\"_blank\"])[4]"));
		handle4.sendKeys(Keys.ENTER);
		Thread.sleep(2000);	
		
		driver.quit();
	}

}
