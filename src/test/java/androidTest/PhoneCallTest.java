package androidTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PhoneCallTest {
	@Test()
	public void callTest() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability("appPackage", "com.google.android.dialer");
		dc.setCapability("appActivity", "com.google.android.dialer.DialtactsActivity");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		WebElement fabButton = driver.findElement(By.id("com.google.android.dialer:id/fab"));
		fabButton.click();
		
		//577480406
		
		WebElement five = driver.findElement(By.id("com.google.android.dialer:id/five"));
		five.click();
		
	
		
	}
}
