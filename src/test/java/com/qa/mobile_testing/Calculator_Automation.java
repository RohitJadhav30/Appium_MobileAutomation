package com.qa.mobile_testing;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator_Automation {
    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("platformName", "Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Completed Successfully");
    }


    @Test
    public void add() throws InterruptedException{
        Thread.sleep(2000);
        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click();
        Thread.sleep(2000);
        WebElement plus = driver.findElement(AppiumBy.accessibilityId("plus"));
        plus.click();
        Thread.sleep(2000);
        WebElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        three.click();
        Thread.sleep(2000);
        WebElement equals = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"equals\"]"));
        equals.click();
    }

    @Test
    public void sub() throws InterruptedException{
        Thread.sleep(2000);
        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click();
        Thread.sleep(2000);
        WebElement plus = driver.findElement(AppiumBy.accessibilityId("minus"));
        plus.click();
        Thread.sleep(2000);
        WebElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        three.click();
        Thread.sleep(2000);
        WebElement equals = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"equals\"]"));
        equals.click();
    }
}
