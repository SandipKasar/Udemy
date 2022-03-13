package com.foray.core;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;

public class iOSAutomateBrowser {

     public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateBrowserSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       Thread.sleep(15000);
        driver.get("https://www.tesla.com");
     }} 