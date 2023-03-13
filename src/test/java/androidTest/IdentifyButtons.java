package androidTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class IdentifyButtons {
	@Test()
	public void identificationTest() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "Android");	
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME , "Android Emulator");
		dc.setCapability(MobileCapabilityType.APP , "/Users/iunonavanidze/Downloads/AndroidUI.apk");
		
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		WebDriver driver = new AndroidDriver(url, dc);
		
		
		
		WebElement popup = driver.findElement(By.id("android:id/button1"));
		
		
		if(popup.isDisplayed() == true) {
			popup.click();
		} 
		
		WebElement button = driver.findElement(By.id("com.coolbase.androidprograming:id/button"));
		Assert.assertEquals(true, button.isDisplayed(), "Unable to find Button");
		button.click();
		
	//	List<WebElement> androidGravityList = driver.findElements(By.className("android.widget.TextView"));
	//	System.out.println(androidGravityList.size());
	//	String value1 = androidGravityList.get(0).getAttribute("text");
	//	String value2 = androidGravityList.get(1).getAttribute("text");
		
	//	androidGravityList.get(0).sendKeys(value2);
		
		// Assert.assertEquals(true, androidGravity.isDisplayed(), "Unable to find Android Button field");
		// androidGravity.click();
		
		
		WebElement input = driver.findElement(By.id("com.coolbase.androidprograming:id/thirdout"));
		Assert.assertEquals(true, input.isDisplayed(), "Unable to find input field");
		input.sendKeys("Mirian");
		
		WebElement designButton = driver.findElement(By.id("com.coolbase.androidprograming:id/design"));
		Assert.assertEquals(true, designButton.isDisplayed(), "Unable to find Design button");
		designButton.click();
	
		
		
	}
}
