package com.qa.mobile_testing;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Mobile_Calculator {
    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "vivo 1904");
        capabilities.setCapability("appPackage", "com.android.bbkcalculator");
        capabilities.setCapability("appActivity", "com.android.bbkcalculator.Calculator");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("platformName", "Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Completed Successfully");
    }

    @AfterTest
    public void quite() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void add() throws InterruptedException{
        Thread.sleep(2000);
        WebElement two = driver.findElement(By.id("com.android.bbkcalculator:id/digit2"));
        two.click();
        Thread.sleep(2000);
        WebElement plus = driver.findElement(By.id("com.android.bbkcalculator:id/plus"));
        plus.click();
        Thread.sleep(2000);
        WebElement three = driver.findElement(By.id("com.android.bbkcalculator:id/digit3"));
        three.click();
        Thread.sleep(2000);
        WebElement equals = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"等于\"]"));
        equals.click();
    }

    @Test
    public void sub() throws InterruptedException{
        Thread.sleep(2000);
        WebElement two = driver.findElement(By.id("com.android.bbkcalculator:id/digit2"));
        two.click();
        Thread.sleep(2000);
        WebElement plus = driver.findElement(By.id("com.android.bbkcalculator:id/minus"));
        plus.click();
        Thread.sleep(2000);
        WebElement three = driver.findElement(By.id("com.android.bbkcalculator:id/digit3"));
        three.click();
        Thread.sleep(2000);
        WebElement equals = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"等于\"]"));
        equals.click();
    }

    @Test
    public void multiply() throws InterruptedException{
        Thread.sleep(2000);
        WebElement two = driver.findElement(By.id("com.android.bbkcalculator:id/digit2"));
        two.click();
        Thread.sleep(2000);
        WebElement plus = driver.findElement(By.id("com.android.bbkcalculator:id/mul"));
        plus.click();
        Thread.sleep(2000);
        WebElement three = driver.findElement(By.id("com.android.bbkcalculator:id/digit3"));
        three.click();
        Thread.sleep(2000);
        WebElement equals = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"等于\"]"));
        equals.click();
    }

    @Test
    public void divide() throws InterruptedException{
        Thread.sleep(2000);
        WebElement two = driver.findElement(By.id("com.android.bbkcalculator:id/digit2"));
        two.click();
        Thread.sleep(2000);
        WebElement plus = driver.findElement(By.id("com.android.bbkcalculator:id/div"));
        plus.click();
        Thread.sleep(2000);
        WebElement three = driver.findElement(By.id("com.android.bbkcalculator:id/digit3"));
        three.click();
        Thread.sleep(2000);
        WebElement equals = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"等于\"]"));
        equals.click();
    }
}

