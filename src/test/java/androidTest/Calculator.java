package androidTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	@Test()
	public void calculationTest() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		
		WebElement seven = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
		Assert.assertEquals(true, seven.isDisplayed());
		seven.click();
		WebElement plus = driver.findElement(By.id("com.android.calculator2:id/op_add"));
		Assert.assertEquals(true, plus.isDisplayed());
		plus.click();
		WebElement five = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
		Assert.assertEquals(true, five.isDisplayed());
		five.click();
		WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));
		Assert.assertEquals(true, equal.isDisplayed());
		equal.click();
		String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
		Assert.assertEquals(true, result.equals("12"), "Test failed, result doesn't match with expected value");
		
		
	}
	
	
}
