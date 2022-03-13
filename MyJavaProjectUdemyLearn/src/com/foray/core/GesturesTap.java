package com.foray.core;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class GesturesTap {

	public static void main(String[] args) throws Exception {
		AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
			
			By accessibility=MobileBy.AccessibilityId("Accessibility");
					
	}

}
//TAP, PRESS, LONGPRESS, WAITACTION, RELEASE, PERFORM, MOVETO