package iOSTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallIOSAppOnSimulator {

	@Test()
	public void InstallApp() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME , "iPhone 14 Pro");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.0");
		dc.setCapability(MobileCapabilityType.APP, "/Users/iunonavanidze/Library/Developer/Xcode/DerivedData/UIKitCatalog-alfhntmetefeuyaiueukjytvsxfd/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
	
		
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		IOSDriver driver = new IOSDriver(url, dc);
		
		
		
		
	}
	
}
