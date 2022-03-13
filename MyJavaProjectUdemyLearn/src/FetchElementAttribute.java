import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class FetchElementAttribute {

	public static void main(String[] args) throws Exception {
		AppiumDriver driver = CreateDriverSession.initializeDriver("Android");

		By accessibility = MobileBy.AccessibilityId("Accessibility");
		System.out.println(driver.findElement(accessibility).getText());
		System.out.println(driver.findElement(accessibility).getAttribute("name"));

		System.out.println(driver.findElement(accessibility));
		System.out.println(driver.findElement(accessibility));
		System.out.println(driver.findElement(accessibility));

		System.out.println(driver.findElement(accessibility).isSelected());// isEnabled, isDisplayed

		// FOR IOS:label, value(on-1,off-0),anabled,selected,visible,
	}

}
