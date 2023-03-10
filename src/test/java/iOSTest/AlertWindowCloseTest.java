package iOSTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AlertWindowCloseTest {

	@Test()
public void AlertWindowCloseTestRun() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME , "iPhone 14 Pro");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.0");
		dc.setCapability(MobileCapabilityType.APP, "/Users/iunonavanidze/Library/Developer/Xcode/DerivedData/UIKitCatalog-alfhntmetefeuyaiueukjytvsxfd/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
	
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		IOSDriver driver = new IOSDriver(url, dc);
		
		WebElement alertViews = driver.findElement(By.id("Alert Views"));
		Assert.assertEquals(true, alertViews.isDisplayed(), "Test Failed Couldn't find button");
		alertViews.click();
		WebElement okayButton = driver.findElement(By.id("Okay / Cancel"));
		Assert.assertEquals(true, okayButton.isDisplayed(), "Test Failed Couldn't find button");
		okayButton.click();
		WebElement okAlert = driver.findElement(By.id("OK"));
		Assert.assertEquals(true, okAlert.isDisplayed(), "Test Failed Couldn't find button");
		okAlert.click();
				
		
	
		
}
	
	
}
