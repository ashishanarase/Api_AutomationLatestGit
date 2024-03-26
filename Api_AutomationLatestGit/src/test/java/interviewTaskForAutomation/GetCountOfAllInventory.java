package interviewTaskForAutomation;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCountOfAllInventory {
	public static void main(String[]args) {

		WebDriverManager.chromedriver().browserVersion(_dyanamicData.UpdateHere.browserVersion).setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement todayDeal_HomePage = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		todayDeal_HomePage.click();

		//li[text()="Previous"]//following::li[5]
		WebElement count_HomePage = driver.findElement(By.xpath("//li[text()=\"Previous\"]//following::li[5]"));
		String count = count_HomePage.getText();
		//System.out.print(count);
		int countInventory = 0;
		for (int index=1; index<100;index++) {
			try {
				WebElement count2_HomePage = driver.findElement(By.xpath("(//div[@class=\"DealCard-module__cardImageVertical_1m9E6mjbE6UbrGJwvn6GKM DealCard-module__imageWithPadding_Qk9F2b8bUeXPk8FUBnSVG\"])["+index +"]"));
				if (count2_HomePage.isDisplayed()) {
					countInventory++;
				}
			} catch (NoSuchElementException e) {
				// Element is not displayed, handle accordingly (e.g., log a message)
				System.out.println("Element is not displayed.");
				System.out.println(countInventory);
				driver.quit();
			}						
		}
		
	}
}

