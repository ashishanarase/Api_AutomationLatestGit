package advancedPracticeCode;

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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSample{

	static WebDriver driver;
	/*There are several ways to perform a click action on a web element.*/

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		WebElement handle1 = driver.findElement(By.xpath("(//a[@target=\"_blank\"])[1]"));
		handle1.click();
		Thread.sleep(2000);
		
		Actions action = new Actions (driver);
		action.contextClick(handle1).build().perform();
		action.doubleClick(handle1).build().perform();
		action.dragAndDrop(handle1, handle1).build().perform();
		action.moveToElement(handle1).build().perform();
		
		Select s = new Select(handle1);
		List <WebElement> listHere = s.getOptions();
		driver.quit();
	}

}
