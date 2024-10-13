package com.qa.mobile_testing;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Mobile_Browser {
    public AppiumDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("appPackage", "com.android.chrome");
        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("platformName", "Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Completed Successfully");
    }

    @Test
    public void amazon() throws InterruptedException, AWTException {
        driver.findElement(By.id("com.android.chrome:id/terms_accept")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.android.chrome:id/negative_button")).click();
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.id("com.android.chrome:id/search_box_text"));
        search.sendKeys("Amazon.com");
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);


        //driver.findElement(AppiumBy.accessibilityId("New tab")).click();
//        WebElement aSearch = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View"));
//        aSearch.sendKeys("iphone");
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View"));
    }
}
