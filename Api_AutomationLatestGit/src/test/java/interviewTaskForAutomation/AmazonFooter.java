package interviewTaskForAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Set;

public class AmazonFooter {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().browserVersion(_dyanamicData.UpdateHere.browserVersion).setup();
		// Launch a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the Amazon website
		driver.get("https://www.amazon.com");
		
		String handle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handle);
		System.out.println(handles);

		// Locate the footer section
		WebElement footerSection = driver.findElement(By.id("navFooter"));

		// Get a list of all the elements in the footer section
		List<WebElement> footerElements = footerSection.findElements(By.tagName("a"));

		// Iterate through the list of elements and click on each element one by one
		for (WebElement element : footerElements) {
			element.click();
		}

		// Close the browser
		driver.quit();
	}
}

