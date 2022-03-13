
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AndInteractsWithApps {
	public static void main(String[] args) throws Exception {
		AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		By views = MobileBy.AccessibilityId("Views");
		By grid = MobileBy.AccessibilityId("Grid");
		By animation = MobileBy.AccessibilityId("Animation");

		driver.findElement(views).click();
	}
}