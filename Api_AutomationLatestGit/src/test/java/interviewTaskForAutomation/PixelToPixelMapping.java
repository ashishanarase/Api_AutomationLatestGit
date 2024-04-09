package interviewTaskForAutomation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PixelToPixelMapping {

	public static void main (String [] args) {
		//
		//		// Initialize ChromeDriver
		//		WebDriver driver = new ChromeDriver();
		//
		//		WebDriverManager.chromedriver().setup();
		//		// Maximize the browser window
		//		driver.manage().window().maximize();
		//
		//		// Navigate to the web page
		//		driver.get("https://example.com");
		//
		//		// Capture screenshot of the entire page
		//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//
		//		try {
		//			// Save the screenshot
		//			copyFile(screenshotFile, new File("screenshot.png"));
		//
		//			// Resize the screenshot to reduce noise in image comparison
		//			BufferedImage screenshot = ImageIO.read(new File("screenshot.png"));
		//			BufferedImage resizedScreenshot = Thumbnails.of(screenshot).size(1024, 768).asBufferedImage();
		//			ImageIO.write(resizedScreenshot, "png", new File("resizedScreenshot.png"));
		//
		//			// Load the reference screenshot (baseline image)
		//			BufferedImage referenceImage = ImageIO.read(new File("reference.png"));
		//
		//			// Load the resized screenshot
		//			BufferedImage testImage = ImageIO.read(new File("resizedScreenshot.png"));
		//
		//			// Compare the screenshots pixel by pixel using Pixelmatch
		//			//	int diffPixels = Pixelmatch.compare(referenceImage, testImage, "diff.png");
		//
		//			// Define a threshold for acceptable differences (adjust as needed)
		//			int threshold = 1000;
		//
		//			// Assert whether the number of different pixels is within the threshold
		//			//		assertTrue("Number of different pixels exceeds threshold: " + diffPixels, diffPixels <= threshold);
		//
		//			// Test passed
		//			System.out.println("Pixel-to-pixel mapping test passed.");
		//
		//		} catch (IOException e) {
		//			// Handle IO exception
		//			e.printStackTrace();
		//			fail("Failed to perform pixel-to-pixel mapping test: " + e.getMessage());
		//		} finally {
		//			// Quit the WebDriver instance
		//			driver.quit();
		//		}
	}
}

