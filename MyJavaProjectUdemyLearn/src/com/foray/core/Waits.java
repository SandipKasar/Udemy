package com.foray.core;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class Waits {
	public static void main(String[] args) throws Exception {
		AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		By accessibility=MobileBy.AccessibilityId("Alert views");
		
}}
