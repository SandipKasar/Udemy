package com.foray.core;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeGesture {
	public static void main(String[] args) throws Exception {
		AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		By views = MobileBy.AccessibilityId("Views");
		By grid = MobileBy.AccessibilityId("Grid");
		By animation = MobileBy.AccessibilityId("Animation");
		
		driver.findElement(views).click();
		
		Dimension size=driver.manage().window().getSize();
		
		int startX=size.width/2;
		int endX=startX;
		int startY= (int) (size.height*0.8);
		int endY=(int) (size.height*0.2);
		
		TouchAction t=new TouchAction(driver);
		t.press(PointOption.point(startX, startY))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		.moveTo(PointOption.point(endX, endY))
		.release()
		.perform();
		

	}

}
