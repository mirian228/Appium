package iOSTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PickerViewsTest {
	
	
	
	@Test()
	public void PickerViewTest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME , "iPhone 14 Pro");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.0");
		dc.setCapability(MobileCapabilityType.APP, "/Users/iunonavanidze/Library/Developer/Xcode/DerivedData/UIKitCatalog-alfhntmetefeuyaiueukjytvsxfd/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
	
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		IOSDriver driver = new IOSDriver(url, dc);
		
		// Click pickerView
		WebElement pickerView = driver.findElement(By.id("Picker View"));
		Assert.assertEquals(true, pickerView.isDisplayed(), "Unable find Picker View Element");
		pickerView.click();
		// Find all Rows
		List<WebElement> allRowValues = driver.findElements(By.xpath("//XCUIElementTypePickerWheel"));
		// Get specific row values
		String value1 = allRowValues.get(0).getAttribute("value");
		Assert.assertEquals(true, value1.equals("65"), "expected value is different");
		String value2 = allRowValues.get(1).getAttribute("value");
		Assert.assertEquals(true, value2.equals("205"), "expected value is different");
		String value3 = allRowValues.get(2).getAttribute("value");
		Assert.assertEquals(true, value3.equals("120"), "expected value is different");
		System.out.println(value1 + " " + value2 + " " + value3);
		
	    
		
		// Set specific values for specific rows
		allRowValues.get(0).sendKeys("40");
		allRowValues.get(1).sendKeys("100");
	    allRowValues.get(2).sendKeys("150");
	    
	    // Applied changes to variables
	    value1 = allRowValues.get(0).getAttribute("value");
		Assert.assertEquals(true, value1.equals("40"), "expected value is different");
		value2 = allRowValues.get(1).getAttribute("value");
		Assert.assertEquals(true, value2.equals("100"), "expected value is different");
		value3 = allRowValues.get(2).getAttribute("value");
		Assert.assertEquals(true, value3.equals("150"), "expected value is different");
	
		
		System.out.println(value1 + " " + value2 + " " + value3);

		
		
		
	}
	
	
	
}
