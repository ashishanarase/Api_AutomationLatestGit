package interviewTaskForAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandeling{

	static WebDriver driver;
	/*Handle a specific window if there are multiple windows*/

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().browserVersion(_dyanamicData.UpdateHere.browserVersion).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[2]")).click();
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[3]")).click();
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[4]")).click();
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		List <String> hList = new ArrayList<String>(handles);
		System.out.println(hList);

		int windowIndexToSwitch = 2;
		int currentIndex = 0;
		for (String windowHandle : handles) {
			if (currentIndex == windowIndexToSwitch) {
				driver.switchTo().window(windowHandle);
				break;
			}
			currentIndex++;
		}

		//switchToWindow("Facebook",hList);
	}

	public static void switchToWindow (String windowTitle, List <String> hList) {
		for (String e : hList) {
			String title = driver.switchTo().window(e).getTitle();
			if (title.contains(windowTitle)) {
				System.out.println("Found right window");
			}

		}
	}

}
