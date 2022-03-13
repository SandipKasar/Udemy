import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CreateBrowserSession {
	public static AppiumDriver initializeDriver(String platformName) throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability("newCommandTimeout", 300);

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		switch (platformName) {
		case "Android":
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Sandip");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator");
			caps.setCapability(MobileCapabilityType.UDID, "RZ8R415L7VY");
			String andChromedriver = System.getProperty("user.dir") + File.separator + "resources" + File.separator
					+ "chromedriver.exe";
			caps.setCapability("chromedriverExecutable", andChromedriver);
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
			
	
			return new AndroidDriver(url, caps);
		case"iOS":
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Sandip");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			caps.setCapability(MobileCapabilityType.UDID, "");

			String appUrl = System.getProperty("user.dir") + File.separator + "resources" + File.separator
					+ "ApiDemos-debug.apa";
			caps.setCapability(MobileCapabilityType.APP, appUrl);

			return new IOSDriver(url, caps);
			default:
				throw new Exception("invalid platform");
		}

	}
}
