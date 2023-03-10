package iOSTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class IdentifyElements {

	@Test()
	public void identifyElements() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME , "iPhone 14 Pro");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.0");
		dc.setCapability(MobileCapabilityType.APP, "/Users/iunonavanidze/Library/Developer/Xcode/DerivedData/UIKitCatalog-alfhntmetefeuyaiueukjytvsxfd/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
	
		
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		IOSDriver driver = new IOSDriver(url, dc);
		
		//Count how many elements are there
		List<WebElement> listOfElements = driver.findElements(By.xpath("//XCUIElementTypeStaticText"));
		
		Thread.sleep(5000);
		
		int i;
		System.out.println("Number of elements: " + listOfElements.size());
		
		for(i=0; i<listOfElements.size(); i++) {
			WebElement item = listOfElements.get(i);
			System.out.println(i+1 + ". " + item.getText());
		}
		
		// Click on element
		WebElement alertview = driver.findElement(By.id("Alert Views"));
		alertview.click();
		
		driver.quit();
		
		
	}
	
}
