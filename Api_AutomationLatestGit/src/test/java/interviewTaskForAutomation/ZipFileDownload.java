package interviewTaskForAutomation;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZipFileDownload {
	
/*	1.There is a Download button on webpage for on zip file and we need to store the downloaded 
  	file that should go directly to the desired stored location path instead of downloading it 
 	directly in the downloads folder */
 
	public static void main(String[] args) throws InterruptedException {
	
		  String downloadPath = "C:\\Users\\ashish.anarase\\Desktop";

	        // Create ChromeOptions object and set download directory
/*	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("disable-infobars");
	        options.addArguments("--disable-extensions");
	        options.addArguments("--disable-popup-blocking");
	        options.addArguments("download.default_directory=" + downloadPath);    */
	        
	        ChromeOptions options = new ChromeOptions();

	        Map<String, Object> prefs = new HashMap<String, Object>();

	        prefs.put("download.default_directory", downloadPath);

	        options.setExperimentalOption("prefs", prefs);

		
	    WebDriverManager.chromedriver().browserVersion("121.0.6167.185").setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.learningcontainer.com/sample-zip-files");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1350)");
		Thread.sleep(2000);
		
		WebElement downloadButton = driver.findElement(By.xpath("(//a[text()=\"Download\"])[1]"));
		
		//WebElement downloadButton = driver.findElement(By.xpath("//a[text()=\"64 bit Windows IE\"]"));
		downloadButton.click();
		
		Thread.sleep(5000);
		
	}

}
